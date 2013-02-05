<%-- 
    Document   : inputForm
    Created on : Feb 4, 2013, 6:20:22 PM
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Restaurant</title>
    </head>
    <body>
        <center><h1>Simple Restaurant</h1></center>
        <p>Choose your food item, but you only get to choose 1!</p>
        <form id ="form1" name="form1" method="POST" action="MainServlet.do">
            <input type="radio" name="food" value="apple">Apple<br>
            <input type="radio" name="food" value="banana">Banana<br>
            <input type="radio" name="food" value="coconut">Coconut<br>
            <input type="radio" name="food" value="date">Date
            <input type ="submit" id ="submit" name="submit" value="submit">
        </form>
    </body>
</html>
