<%-- 
    Document   : listStudent
    Created on : Aug 21, 2016, 1:47:49 PM
    Author     : Bhuwan Prasad Upadhyay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Student</title>
        <%@include file="../common/cssLoader.jsp" %>
    </head>
    <body>
        <c:if test="${requestScope.sucess ne null}">
            <c:out value="${requestScope.sucess}"/>
        </c:if>
        
        <%@include  file="../common/jsLoader.jsp" %>
    </body>
</html>
