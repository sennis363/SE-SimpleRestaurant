<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output</title>
    </head>
    <body>
        <h1>Thank you for placing an order!</h1>
        <br/>
        <h4>item: [price/tax/tip/final price]</h4>
        <%
            if (request.getAttribute("result") != null || request.getAttribute("result") != "") {
                String fruit = request.getAttribute("fruit").toString();
                Object output = request.getAttribute("result");
                if (fruit.equals("apple")) {
                    out.println("APPLE: " + output);
                } else if (fruit.equals("banana")) {
                    out.println("BANANA: " + output);
                } else if (fruit.equals("coconut")) {
                    out.println("COCONUT: " + output);
                } else {
                    out.println("DATE: " + output);
                }
            }
        %>
        <h3><a href="inputForm.jsp">Go back</a></h3>
    </body>
</html>
