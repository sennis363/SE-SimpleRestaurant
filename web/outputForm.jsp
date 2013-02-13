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
        <h1>price/tax/tip/final price</h1>
        <%
            if (request.getAttribute("result1") != null) {
                Object output = request.getAttribute("result1");
                out.println("APPLE: " + output);
            } else if (request.getAttribute("result2") != null) {
                Object output = request.getAttribute("result2");
                out.println("BANANA: " + output);
            } else if (request.getAttribute("result3") != null) {
                Object output = request.getAttribute("result3");
                out.println("COCONUT: " + output);
            } else if (request.getAttribute("result4") != null) {
                Object output = request.getAttribute("result4");
                out.println("DATE: " + output);
            }
        %>
            <h3><a href="inputForm.jsp">Go back</a></h3>
    </body>
</html>
