<%-- 
    Document   : index
    Created on : Aug 21, 2016, 1:14:00 PM
    Author     : Bhuwan Prasad Upadhyay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Entry System</title>
        <%@include file="common/cssLoader.jsp" %>
    </head>
    <body>
        <h1>Welcome to Student Entry System</h1>

        <ul class="list-group">
            <li class="list-group-item">
                <a href="<c:url value="/addStudent"/>">Add Student</a>
            </li>
            <li class="list-group-item">
                <a href="<c:url value="/listStudent"/>">List Student</a>
            </li>            
        </ul>

        <%@include file="common/jsLoader.jsp" %>
    </body>
</html>
