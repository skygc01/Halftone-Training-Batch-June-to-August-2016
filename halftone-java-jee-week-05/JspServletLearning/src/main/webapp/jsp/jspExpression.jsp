<%-- 
    Document   : jspExpression
    Created on : Aug 20, 2016, 2:39:40 PM
    Author     : Bhuwan Prasad Upadhyay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    int a = 10;
    int b = 20;
    int c = 30;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Expression</title>
    </head>
    <body>
        <%= "Sum=" + (a + b + c)%>
        <script>
            alert('<%= (a + b + c)%>');
        </script>
        <h2><%= request.getContextPath() %></h2>
    </body>
</html>
