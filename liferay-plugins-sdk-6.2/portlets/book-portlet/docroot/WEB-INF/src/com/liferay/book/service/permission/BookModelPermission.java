package com.liferay.book.service.permission;

import com.liferay.book.model.Book;
import com.liferay.book.service.BookLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

public class BookModelPermission {

	public static final String RESOURCE_NAME = "com.liferay.book.model.Book";

	public static void check(PermissionChecker permissionChecker, Book book, String actionId) throws PortalException {

		if (!contains(permissionChecker, book, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker, long bookId, String actionId)
			throws PortalException, SystemException {
		if (!contains(permissionChecker, bookId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long bookId, String actionId)
			throws PortalException, SystemException {
		return contains(permissionChecker, BookLocalServiceUtil.getBook(bookId), actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, Book book, String actionId) {
		if (permissionChecker.hasOwnerPermission(book.getCompanyId(), Book.class.getName(), book.getBookId(),
				book.getUserId(), actionId)
				|| permissionChecker.hasPermission(book.getGroupId(), Book.class.getName(), book.getBookId(),
						actionId)) {

			return true;
		}

		return false;
	}
}
