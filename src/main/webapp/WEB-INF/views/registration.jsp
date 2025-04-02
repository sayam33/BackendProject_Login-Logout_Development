<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <h2>Register Here...</h2>
     <form action="registrationController" method="post">
         <pre>
         Name   <input type="text" name="name"/>
         Email  <input type="text" name="email"/>
         Course <input type="text" name="course"/>
         Mobile <input type="text" name="mobile"/>
          <input type="submit" value="save"/>
         </pre>
     </form>
     <%
       if(request.getAttribute("msg")!=null){
    	   out.println(request.getAttribute("msg"));
       }
     %>

</body>
</html>