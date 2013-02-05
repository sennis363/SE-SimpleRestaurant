<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output</title>
    </head>
    <body>
        <h1><center>price/tax/tip/final price</center></h1>
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
