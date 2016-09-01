<%-- 
    Document   : jspScriplets
    Created on : Aug 20, 2016, 2:49:24 PM
    Author     : Bhuwan Prasad Upadhyay
--%>


<%@page import="java.util.Random" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Scriplets</title>
    </head>
    <body>
        <%
            String name = "Ram";

            String[] countries = new String[]{"Nepal", "Chaina"};

            for (String country : countries) {
        %>
        <h3><%= country%></h3>
        <%
            }

            Random random = new Random();
            while (true) {
        %>
        <h4><%= random.nextInt()%></h4>
        <%
                if (random.nextInt() > 100) {
                    break;
                }
            }
            System.out.println("Hello Scriptlets");
        %>
    </body>
</html>
