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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BookService}.
 *
 * @author terry
 * @see BookService
 * @generated
 */
@ProviderType
public class BookServiceWrapper implements BookService,
	ServiceWrapper<BookService> {
	public BookServiceWrapper(BookService bookService) {
		_bookService = bookService;
	}

	@Override
	public com.liferay.book.model.Book addBook(java.lang.String name,
		java.lang.String author, java.lang.String description, double price,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookService.addBook(name, author, description, price,
			serviceContext);
	}

	@Override
	public com.liferay.book.model.Book deleteBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookService.deleteBook(bookId);
	}

	@Override
	public com.liferay.book.model.Book updateBook(long bookId,
		java.lang.String name, java.lang.String author,
		java.lang.String description, double price,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookService.updateBook(bookId, name, author, description,
			price, serviceContext);
	}

	@Override
	public int getBooksCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookService.getBooksCount(groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bookService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.book.model.Book> getBooks(long groupId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookService.getBooks(groupId, start, end);
	}

	@Override
	public BookService getWrappedService() {
		return _bookService;
	}

	@Override
	public void setWrappedService(BookService bookService) {
		_bookService = bookService;
	}

	private BookService _bookService;
}