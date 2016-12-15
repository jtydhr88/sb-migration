create table BOOK_Book (
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bookId LONG not null primary key,
	name VARCHAR(75) null,
	author VARCHAR(75) null,
	description TEXT null,
	price DOUBLE
);