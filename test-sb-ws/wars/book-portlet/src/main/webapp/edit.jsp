<%@ include file="/init.jsp" %>

<%
String redirect = ParamUtil.getString(request, "redirect");

long bookId = ParamUtil.getLong(request, "bookId");

Book book = null;

if (bookId > 0 ){
	book = BookLocalServiceUtil.getBook(bookId);
}
%>

<portlet:actionURL name="editBook" var="editBookUrl" />

<aui:form action="<%= editBookUrl %>" method="post" name="fm">
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:input name="bookId" type="hidden" value="<%= bookId %>" />

	<liferay-ui:header
		backURL="<%= redirect %>"
		title='<%= (book != null) ? book.getName() : "new-book" %>'
	/>
	
	<aui:model-context bean="<%= book %>" model="<%= Book.class %>" />
		<aui:fieldset>
		<aui:input name="name" />

		<aui:input name="author" />

		<aui:input name="description" />

		<aui:input name="price" />

		<liferay-ui:input-permissions modelName="<%= Book.class.getName() %>"/>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button href="<%= redirect %>" type="cancel" />
	</aui:button-row>
</aui:form>
