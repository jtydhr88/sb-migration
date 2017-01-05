package com.liferay.book.util.comparator;

import com.liferay.book.model.Book;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

public class BookCreateDateComparator extends OrderByComparator {
	public static final String ORDER_BY_ASC = "Book.createDate ASC";

	public static final String ORDER_BY_DESC = "Book.createDate DESC";

	public static final String[] ORDER_BY_FIELDS = { "createDate" };

	public BookCreateDateComparator() {
		this(false);
	}

	public BookCreateDateComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		Book book1 = (Book) obj1;
		Book book2 = (Book) obj2;

		int value = DateUtil.compareTo(book1.getCreateDate(), book2.getCreateDate());

		if (_ascending) {
			return value;
		} else {
			return -value;
		}
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		} else {
			return ORDER_BY_DESC;
		}
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private boolean _ascending;

}