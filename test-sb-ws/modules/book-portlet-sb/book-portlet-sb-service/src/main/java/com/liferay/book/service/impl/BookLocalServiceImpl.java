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

import com.liferay.book.model.Book;
import com.liferay.book.service.base.BookLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.book.service.BookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author terry
 * @see com.liferay.book.service.base.BookLocalServiceBaseImpl
 * @see com.liferay.book.service.BookLocalServiceUtil
 */
public class BookLocalServiceImpl extends BookLocalServiceBaseImpl {

	public Book addBook(String name, String author, String description, double price, ServiceContext serviceContext)
			throws SystemException, PortalException {
		long bookId = counterLocalService.increment();

		Book book = bookPersistence.create(bookId);

		book.setGroupId(serviceContext.getScopeGroupId());
		book.setCompanyId(serviceContext.getCompanyId());
		book.setUserId(serviceContext.getUserId());
		book.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());

		book.setName(name);
		book.setAuthor(author);
		book.setDescription(description);
		book.setPrice(price);
		book.setCreateDate(serviceContext.getCreateDate(null));

		bookPersistence.update(book);

		resourceLocalService.addModelResources(book, serviceContext);

		return book;
	}

	public Book updateBook(long bookId, String name, String author, String description, double price,
			ServiceContext serviceContext) throws SystemException, PortalException {
		Book book = bookPersistence.fetchByPrimaryKey(bookId);

		book.setUserId(serviceContext.getUserId());
		book.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());

		book.setName(name);
		book.setAuthor(author);
		book.setDescription(description);
		book.setPrice(price);

		bookPersistence.update(book);

		return book;
	}

	public Book deleteBook(long bookId) throws SystemException, PortalException {
		Book book = bookPersistence.fetchByPrimaryKey(bookId);

		resourceLocalService.deleteResource(book, ResourceConstants.SCOPE_INDIVIDUAL);

		return bookPersistence.remove(bookId);
	}

}