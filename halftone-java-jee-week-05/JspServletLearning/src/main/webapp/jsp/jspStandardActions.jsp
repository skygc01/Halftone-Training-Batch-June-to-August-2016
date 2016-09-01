<%-- 
    Document   : jspStandardActions
    Created on : Aug 20, 2016, 3:00:30 PM
    Author     : Bhuwan Prasad Upadhyay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="studentBean" class="com.developerbhuwan.jspservletlearning.bean.StudentBean"></jsp:useBean>
<jsp:setProperty name="studentBean" property="name" value="Bhuwan Prasad Upadhyay"></jsp:setProperty>
<jsp:setProperty name="studentBean" property="collegeName" value="Dhangadhi Engineering College"></jsp:setProperty>
<jsp:setProperty name="studentBean" property="address" value="Dhangadhi"/>
<jsp:setProperty name="studentBean" property="rollNo" value="1" />
<jsp:setProperty name="studentBean" property="classLevel" value="15"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Standard Actions</title>
    </head>
    <body>
        <jsp:include page="innerPage.jsp"></jsp:include>
        <jsp:getProperty name="studentBean" property="address"></jsp:getProperty>
    </body>
</html>
