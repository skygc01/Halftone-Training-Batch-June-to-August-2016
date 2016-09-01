<%-- 
    Document   : jspDeclaration
    Created on : Aug 20, 2016, 1:56:43 PM
    Author     : Bhuwan Prasad Upadhyay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! //Declaration

    //variable
    String name = "Bhuwan";

    //methods
    int add(int a, int b) {
        return a + b;
    }

    int mul(int a, int b) {
        return a * b;
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Declaration</title>
    </head>
    <body>
        <p>Add 20 + 30  = </p> <%= add(20, 30)%>

        <p>Mul 20 * 30  = </p> <%= mul(20, 30)%>

        <%
            int a = add(30, 50);
            out.println("Add Rn=" + (a + 50));            
        %>
        
        <h1><%= name%></h1>
        
    </body>
</html>
