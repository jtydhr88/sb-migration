/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.book.service.impl;

import java.util.List;

import com.liferay.book.model.Book;
import com.liferay.book.service.base.BookServiceBaseImpl;
import com.liferay.book.service.permission.BookModelPermission;
import com.liferay.book.service.permission.BookPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the book remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.book.service.BookService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author terry
 * @see com.liferay.book.service.base.BookServiceBaseImpl
 * @see com.liferay.book.service.BookServiceUtil
 */
public class BookServiceImpl extends BookServiceBaseImpl {

	public List<Book> getBooks(long groupId, int start, int end) throws SystemException {
		return bookPersistence.filterFindByGroup(groupId, start, end);
	}

	public int getBooksCount(long groupId) throws SystemException {
		return bookPersistence.countByGroup(groupId);
	}

	public Book addBook(String name, String author, String description, double price, ServiceContext serviceContext)
			throws SystemException, PortalException {
		BookPermission.check(getPermissionChecker(), serviceContext.getScopeGroupId(), "ADD_BOOK");

		return bookLocalService.addBook(name, author, description, price, serviceContext);
	}

	public Book updateBook(long bookId, String name, String author, String description, double price,
			ServiceContext serviceContext) throws SystemException, PortalException {

		BookModelPermission.check(getPermissionChecker(), bookId, ActionKeys.UPDATE);

		return bookLocalService.updateBook(bookId, name, author, description, price, serviceContext);
	}

	public Book deleteBook(long bookId) throws SystemException, PortalException {
		Book book = bookLocalService.getBook(bookId);

		BookModelPermission.check(getPermissionChecker(), book, ActionKeys.DELETE);

		return bookLocalService.deleteBook(bookId);
	}
}