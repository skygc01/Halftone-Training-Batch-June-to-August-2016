<%-- 
    Document   : jstlTag
    Created on : Aug 21, 2016, 11:51:06 AM
    Author     : Bhuwan Prasad Upadhyay
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Tags</title>
    </head>
    <body>
        <c:set var="choice" value="${2}"/>
        <c:if test="${choice eq 2}">
            <p>I am choice 2</p>
        </c:if>
        <c:if test="${choice ne 2}">
            <p>I am not choice 2</p>
        </c:if>
        <c:if test="${true and false}">
            <p>I am 1 && 0 = 0</p>
        </c:if>
        <table border="1" cellpadding="1">
            <tr>
                <th>Roll No</th>
                <th>Name</th>
                <th>Address</th>
                <th>College</th>
                <th>Class Level</th>
            </tr>
            <c:forEach items="${requestScope.studentList}" var="student">
                <tr>
                    <td><c:out value="${student.getRollNo()}"/></td>
                    <td><c:out value="${student.name}"/></td>
                    <td><c:out value="${student.address}"/></td>
                    <td><c:out value="${student.collegeName}"/></td>
                    <td><c:out value="${student.classLevel}"/></td>
                </tr>
            </c:forEach>    
        </table>
        <a href="<c:url value="/jstl"/>">JSTL Servlet</a>
        <p>Link : <c:out value="${requestScope.link}"/></p>
        <c:set var="switchCh" value="C"></c:set>
        <c:choose>
            <c:when test="${switchCh eq 'A'}">
                <c:out value="I am A"/>
            </c:when>
            <c:when test="${switchCh eq 'B'}">
                <c:out value="I am B"/>
            </c:when>
            <c:otherwise>
                 <c:out value="I am other"/>   
            </c:otherwise>
        </c:choose>
    </body>
</html>
