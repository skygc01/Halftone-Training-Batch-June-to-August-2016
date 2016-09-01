<!-- 
Directives
1. Page 
2. Tag
3. Include
-->
<!-- page directives -->
<%@page import="java.sql.Connection" %>
<%@page pageEncoding="UTF-8" contentType="text/html" %>

<!-- tag directives -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${1 eq 1}">
    <c:out value="1 is always 1"></c:out>
</c:if>

<c:set var="name" value=""></c:set>
    
<c:forEach items="${name}" var="n">
    <c:out value="${n}"></c:out>
</c:forEach>

<!-- include directives -->
<%@include file="innerPage.jsp" %>




