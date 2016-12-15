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

package com.liferay.book.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Book. This utility wraps
 * {@link com.liferay.book.service.impl.BookServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author terry
 * @see BookService
 * @see com.liferay.book.service.base.BookServiceBaseImpl
 * @see com.liferay.book.service.impl.BookServiceImpl
 * @generated
 */
@ProviderType
public class BookServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.book.service.impl.BookServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.book.model.Book addBook(java.lang.String name,
		java.lang.String author, java.lang.String description, double price,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addBook(name, author, description, price, serviceContext);
	}

	public static com.liferay.book.model.Book deleteBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBook(bookId);
	}

	public static com.liferay.book.model.Book updateBook(long bookId,
		java.lang.String name, java.lang.String author,
		java.lang.String description, double price,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateBook(bookId, name, author, description, price,
			serviceContext);
	}

	public static int getBooksCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooksCount(groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.book.model.Book> getBooks(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooks(groupId, start, end);
	}

	public static BookService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookService, BookService> _serviceTracker = ServiceTrackerFactory.open(BookService.class);
}