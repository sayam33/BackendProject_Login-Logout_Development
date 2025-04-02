<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List All Registrations</title>
</head>
<body>
   <h2>List All Registrations</h2>
    <table>
        <tr>
           <th>Name</th>
           <th>Email</th>
           <th>Course</th>
           <th>Mobile</th>
            <th>Delete</th>
             <th>Edit</th>
        </tr>
        
        <%
            ResultSet result = (ResultSet) request.getAttribute("res");
            while(result.next()){         
        %>
        <tr>
           <td><%=result.getString(1)%></td>
           <td><%=result.getString(2)%></td>
           <td><%=result.getString(3)%></td>
           <td><%=result.getString(4)%></td>
           <td><a href="deleteController?email=<%=result.getString(2)%>">delete</a></td>
           <td><a href="updateController?email=<%=result.getString(2)%>&mobile=<%=result.getString(4)%>">edit</a></td>
        </tr>
        
        
        <% } %>
    </table>

</body>
</html>