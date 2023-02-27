
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
    <title>Welcome</title>
    </head>
     <body>
<%
    String login = (String) request.getAttribute("login");
%>
<h3>
<%= ("Welcome " + login + " !")%>
    <br>

</h3>
     <form action=films>

         <input type="submit">
     </form>
     </body>
</html>
