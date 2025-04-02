<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
     <h2>Update Registration Here...</h2>
     <form action="updateController" method="post">
         <pre>
         Email   <input type="text" name="email" value="<%=request.getAttribute("email")%>"/>
         Mobile  <input type="text" name="mobile" value="<%=request.getAttribute("mobile")%>"/>        
          <input type="submit" value="update"/>
         </pre>
     </form>
     <%
       if(request.getAttribute("msg")!=null){
    	   out.println(request.getAttribute("msg"));
       }
     %>

</body>
</html>