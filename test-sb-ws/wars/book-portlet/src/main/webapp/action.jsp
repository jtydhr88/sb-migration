<%@ include file="/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Book book = null;

if (row != null) {
	book = (Book)row.getObject();
}

boolean canDelete = BookModelPermission.contains(themeDisplay.getPermissionChecker(), book, ActionKeys.DELETE);

boolean canPermissions = BookModelPermission.contains(themeDisplay.getPermissionChecker(), book, ActionKeys.PERMISSIONS);
%>

<liferay-ui:icon-menu showExpanded="<%= row == null %>" showWhenSingleIcon="<%= row == null %>">

	<c:if test="<%= canDelete %>">
		<portlet:actionURL var="deleteURL" name="deleteBook">
			<portlet:param name="bookId" value="<%= String.valueOf(book.getBookId()) %>" />
		</portlet:actionURL>
	
		<liferay-ui:icon-delete url="<%= deleteURL %>" />
	</c:if>
	
	<c:if test="<%= canPermissions %>">
		<liferay-security:permissionsURL
		    modelResource="<%= Book.class.getName() %>"
		    modelResourceDescription="<%= book.getName() %>"
		    resourcePrimKey="<%= String.valueOf(book.getBookId()) %>"
		    var="permissionsURL" />
		
		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>
</liferay-ui:icon-menu>