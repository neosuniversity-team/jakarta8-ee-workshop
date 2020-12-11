<%-- 
    Document   : employees
    Created on : 10/12/2020, 06:32:17 PM
    Author     : hhugohm
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de empleados</h1>
        <table>
        <c:forEach items="${requestScope.employees}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.firstName}</td>
                        <td>${employee.lastName}</td>
                        <td>${employee.email}</td>
                    </tr>
                </c:forEach> 
          </table>
    </body>
</html>
