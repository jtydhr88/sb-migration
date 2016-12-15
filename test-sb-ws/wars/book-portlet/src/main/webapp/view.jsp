<%@ include file="/init.jsp" %>

<%
boolean addBook = BookPermission.contains(themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroupId(), "ADD_BOOK");
%>
<aui:button-row>
	<c:if test="<%= addBook %>">
	<portlet:renderURL var="editBookURL">
		<portlet:param name="mvcPath" value="/edit.jsp" />
		<portlet:param name="redirect" value="<%= currentURL %>" />
	</portlet:renderURL>

	<aui:button href="<%= editBookURL %>" value="add-book" />
	</c:if>
</aui:button-row>

<liferay-ui:search-container
	emptyResultsMessage="there-are-no-books"
>
	<liferay-ui:search-container-results>
	<%
	searchContainer.setTotal(BookServiceUtil.getBooksCount(themeDisplay.getScopeGroupId()));
	searchContainer.setResults(BookServiceUtil.getBooks(themeDisplay.getScopeGroupId(),searchContainer.getStart(), searchContainer.getEnd()));
	%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row
		className="com.liferay.book.model.Book"
		keyProperty="primaryKeyObj"
		modelVar="book"
	>
		<portlet:renderURL var="viewBookUrl">
			<portlet:param name="bookId" value="<%= String.valueOf(book.getBookId())  %>"/>
			<portlet:param name="redirect" value="<%= currentURL %>" />
			<portlet:param name="mvcPath" value="/edit.jsp" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text
			name="name"
			value="<%= book.getName() %>"
			href="<%= viewBookUrl %>"
		/>
		<liferay-ui:search-container-column-text
			name="author"
			value="<%= book.getAuthor() %>"
			href="<%= viewBookUrl %>"
		/>
		<liferay-ui:search-container-column-text
			name="price"
			value="<%= String.valueOf(book.getPrice()) %>"
			href="<%= viewBookUrl %>"
		/>
		<liferay-ui:search-container-column-jsp
			path="/action.jsp"
			valign="top"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>