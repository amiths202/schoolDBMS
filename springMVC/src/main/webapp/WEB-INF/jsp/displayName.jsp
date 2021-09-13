<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
<h1>SID: <c:out value="${name.getSid()}"/>  </h1>
 <h1>Fname: <c:out value="${name.getFname()}"/>  </h1>
 <h1>Lname: <c:out value="${name.getLname()}"/>  </h1>
 <h1>DoB: <c:out value="${name.getDob()}"/>  </h1>
 <h1>Address: <c:out value="${name.getAddress()}"/>  </h1>
</body></html>