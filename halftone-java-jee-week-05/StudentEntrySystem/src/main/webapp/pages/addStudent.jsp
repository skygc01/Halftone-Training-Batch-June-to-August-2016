<%-- 
    Document   : addStudent
    Created on : Aug 21, 2016, 1:47:40 PM
    Author     : Bhuwan Prasad Upadhyay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student</title>
        <%@include file="../common/cssLoader.jsp" %>
    </head>
    <body>
        <div class="container">
            <div class="row" style="padding-top: 50px;">
                <h4>Add Student</h4>
                <form action="<c:url value="/addStudent"/>" method="POST">
                    <div class="input-group">
                        <span>Student Name:</span>
                        <input type="text" class="form-control" name="studentName">
                    </div>
                    <div class="input-group">
                        <span>Student Address:</span>
                        <input type="text" class="form-control" name="studentAddress">
                    </div>
                    <br>
                    <button type="submit" class="btn btn-primary">Submit</button>
                    <button type="reset" class="btn btn-warning">Reset</button>
                </form>
            </div>

        </div>

        <%@include file="../common/jsLoader.jsp" %>
    </body>
</html>
