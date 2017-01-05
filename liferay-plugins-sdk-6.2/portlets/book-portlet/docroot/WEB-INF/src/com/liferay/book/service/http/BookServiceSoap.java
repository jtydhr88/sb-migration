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

package com.liferay.book.service.http;

import com.liferay.book.service.BookServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.book.service.BookServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.book.model.BookSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.book.model.Book}, that is translated to a
 * {@link com.liferay.book.model.BookSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author terry
 * @see BookServiceHttp
 * @see com.liferay.book.model.BookSoap
 * @see com.liferay.book.service.BookServiceUtil
 * @generated
 */
public class BookServiceSoap {
	public static com.liferay.book.model.BookSoap[] getBooks(long groupId,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws RemoteException {
		try {
			java.util.List<com.liferay.book.model.Book> returnValue = BookServiceUtil.getBooks(groupId,
					start, end, obc);

			return com.liferay.book.model.BookSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getBooksCount(long groupId) throws RemoteException {
		try {
			int returnValue = BookServiceUtil.getBooksCount(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.book.model.BookSoap addBook(
		java.lang.String name, java.lang.String author,
		java.lang.String description, double price,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.book.model.Book returnValue = BookServiceUtil.addBook(name,
					author, description, price, serviceContext);

			return com.liferay.book.model.BookSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.book.model.BookSoap updateBook(long bookId,
		java.lang.String name, java.lang.String author,
		java.lang.String description, double price,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.book.model.Book returnValue = BookServiceUtil.updateBook(bookId,
					name, author, description, price, serviceContext);

			return com.liferay.book.model.BookSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.book.model.BookSoap deleteBook(long bookId)
		throws RemoteException {
		try {
			com.liferay.book.model.Book returnValue = BookServiceUtil.deleteBook(bookId);

			return com.liferay.book.model.BookSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(BookServiceSoap.class);
}