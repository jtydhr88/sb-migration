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

package com.liferay.book.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Book}.
 * </p>
 *
 * @author terry
 * @see Book
 * @generated
 */
@ProviderType
public class BookWrapper implements Book, ModelWrapper<Book> {
	public BookWrapper(Book book) {
		_book = book;
	}

	@Override
	public Class<?> getModelClass() {
		return Book.class;
	}

	@Override
	public String getModelClassName() {
		return Book.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bookId", getBookId());
		attributes.put("name", getName());
		attributes.put("author", getAuthor());
		attributes.put("description", getDescription());
		attributes.put("price", getPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	@Override
	public Book toEscapedModel() {
		return new BookWrapper(_book.toEscapedModel());
	}

	@Override
	public Book toUnescapedModel() {
		return new BookWrapper(_book.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _book.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _book.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _book.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _book.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Book> toCacheModel() {
		return _book.toCacheModel();
	}

	/**
	* Returns the price of this book.
	*
	* @return the price of this book
	*/
	@Override
	public double getPrice() {
		return _book.getPrice();
	}

	@Override
	public int compareTo(Book book) {
		return _book.compareTo(book);
	}

	@Override
	public int hashCode() {
		return _book.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _book.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BookWrapper((Book)_book.clone());
	}

	/**
	* Returns the author of this book.
	*
	* @return the author of this book
	*/
	@Override
	public java.lang.String getAuthor() {
		return _book.getAuthor();
	}

	/**
	* Returns the description of this book.
	*
	* @return the description of this book
	*/
	@Override
	public java.lang.String getDescription() {
		return _book.getDescription();
	}

	@Override
	public java.lang.String getImageUrl() {
		return _book.getImageUrl();
	}

	/**
	* Returns the name of this book.
	*
	* @return the name of this book
	*/
	@Override
	public java.lang.String getName() {
		return _book.getName();
	}

	/**
	* Returns the user name of this book.
	*
	* @return the user name of this book
	*/
	@Override
	public java.lang.String getUserName() {
		return _book.getUserName();
	}

	/**
	* Returns the user uuid of this book.
	*
	* @return the user uuid of this book
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _book.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _book.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _book.toXmlString();
	}

	/**
	* Returns the create date of this book.
	*
	* @return the create date of this book
	*/
	@Override
	public Date getCreateDate() {
		return _book.getCreateDate();
	}

	/**
	* Returns the modified date of this book.
	*
	* @return the modified date of this book
	*/
	@Override
	public Date getModifiedDate() {
		return _book.getModifiedDate();
	}

	/**
	* Returns the book ID of this book.
	*
	* @return the book ID of this book
	*/
	@Override
	public long getBookId() {
		return _book.getBookId();
	}

	/**
	* Returns the company ID of this book.
	*
	* @return the company ID of this book
	*/
	@Override
	public long getCompanyId() {
		return _book.getCompanyId();
	}

	/**
	* Returns the group ID of this book.
	*
	* @return the group ID of this book
	*/
	@Override
	public long getGroupId() {
		return _book.getGroupId();
	}

	/**
	* Returns the primary key of this book.
	*
	* @return the primary key of this book
	*/
	@Override
	public long getPrimaryKey() {
		return _book.getPrimaryKey();
	}

	/**
	* Returns the user ID of this book.
	*
	* @return the user ID of this book
	*/
	@Override
	public long getUserId() {
		return _book.getUserId();
	}

	@Override
	public void persist() {
		_book.persist();
	}

	/**
	* Sets the author of this book.
	*
	* @param author the author of this book
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_book.setAuthor(author);
	}

	/**
	* Sets the book ID of this book.
	*
	* @param bookId the book ID of this book
	*/
	@Override
	public void setBookId(long bookId) {
		_book.setBookId(bookId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_book.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this book.
	*
	* @param companyId the company ID of this book
	*/
	@Override
	public void setCompanyId(long companyId) {
		_book.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this book.
	*
	* @param createDate the create date of this book
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_book.setCreateDate(createDate);
	}

	/**
	* Sets the description of this book.
	*
	* @param description the description of this book
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_book.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_book.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_book.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_book.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this book.
	*
	* @param groupId the group ID of this book
	*/
	@Override
	public void setGroupId(long groupId) {
		_book.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this book.
	*
	* @param modifiedDate the modified date of this book
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_book.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this book.
	*
	* @param name the name of this book
	*/
	@Override
	public void setName(java.lang.String name) {
		_book.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_book.setNew(n);
	}

	/**
	* Sets the price of this book.
	*
	* @param price the price of this book
	*/
	@Override
	public void setPrice(double price) {
		_book.setPrice(price);
	}

	/**
	* Sets the primary key of this book.
	*
	* @param primaryKey the primary key of this book
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_book.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_book.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this book.
	*
	* @param userId the user ID of this book
	*/
	@Override
	public void setUserId(long userId) {
		_book.setUserId(userId);
	}

	/**
	* Sets the user name of this book.
	*
	* @param userName the user name of this book
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_book.setUserName(userName);
	}

	/**
	* Sets the user uuid of this book.
	*
	* @param userUuid the user uuid of this book
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_book.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookWrapper)) {
			return false;
		}

		BookWrapper bookWrapper = (BookWrapper)obj;

		if (Objects.equals(_book, bookWrapper._book)) {
			return true;
		}

		return false;
	}

	@Override
	public Book getWrappedModel() {
		return _book;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _book.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _book.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_book.resetOriginalValues();
	}

	private final Book _book;
}