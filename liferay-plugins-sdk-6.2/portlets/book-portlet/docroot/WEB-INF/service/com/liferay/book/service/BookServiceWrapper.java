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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BookService}.
 *
 * @author terry
 * @see BookService
 * @generated
 */
public class BookServiceWrapper implements BookService,
	ServiceWrapper<BookService> {
	public BookServiceWrapper(BookService bookService) {
		_bookService = bookService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _bookService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_bookService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bookService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.liferay.book.model.Book> getBooks(long groupId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookService.getBooks(groupId, start, end);
	}

	@Override
	public int getBooksCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bookService.getBooksCount(groupId);
	}

	@Override
	public com.liferay.book.model.Book addBook(java.lang.String name,
		java.lang.String author, java.lang.String description, double price,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookService.addBook(name, author, description, price,
			serviceContext);
	}

	@Override
	public com.liferay.book.model.Book updateBook(long bookId,
		java.lang.String name, java.lang.String author,
		java.lang.String description, double price,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookService.updateBook(bookId, name, author, description,
			price, serviceContext);
	}

	@Override
	public com.liferay.book.model.Book deleteBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookService.deleteBook(bookId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BookService getWrappedBookService() {
		return _bookService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBookService(BookService bookService) {
		_bookService = bookService;
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