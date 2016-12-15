package com.liferay.book.service.permission;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

@Component(
	immediate = true,
	property = {"model.class.name=com.liferay.book.model"}
)
public class BookPermission {
	public static final String RESOURCE_NAME = "com.liferay.book.model";

	public static void check(PermissionChecker permissionChecker, long groupId, String actionId)
			throws PortalException {

		if (!contains(permissionChecker, groupId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long groupId, String actionId) {
		return permissionChecker.hasPermission(groupId, RESOURCE_NAME, groupId, actionId);
	}
}
