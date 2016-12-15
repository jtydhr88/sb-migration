package com.liferay.book.portlet;

import java.awt.print.Book;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.book.service.BookServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

public class BookPortlet extends MVCPortlet {

	public void editBook(ActionRequest req, ActionResponse resp) throws SystemException, PortalException {
		String name = ParamUtil.getString(req, "name");
		String author = ParamUtil.getString(req, "author");
		String description = ParamUtil.getString(req, "description");
		double price = ParamUtil.getDouble(req, "price");

		long bookId = ParamUtil.getLong(req, "bookId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Book.class.getName(), req);

		if (bookId > 0) {
			BookServiceUtil.updateBook(bookId, name, author, description, price, serviceContext);
		} else {
			BookServiceUtil.addBook(name, author, description, price, serviceContext);
		}
	}

	public void deleteBook(ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortalException, SystemException {
		long bookId = ParamUtil.getLong(actionRequest, "bookId");

		BookServiceUtil.deleteBook(bookId);
	}

}
