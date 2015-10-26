<%--
  Created by IntelliJ IDEA.
  User: elis
  Date: 19/10/2015
  Time: 12:37 πμ
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.springapp.mvc.model.Location" %>
<%@ page import="java.util.List" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Depertments</title>
</head>
<body>

<h2>SHOW DEPARTMENTS</h2>

<h3>dEPARTMENTS</h3>

<table class="data" border="1">
  <tr>
    <th>NAME</th>
    <th>SELECT</th>

  </tr>
  <c:forEach items="${deptListByLocId}" var="dept">
    <tr>
      <td>${dept.name}</td>
      <td style="text-align: center"><a href="getEmpByDeptId/${dept.id}">#</a></td>
    </tr>
  </c:forEach>
</table>

</body>
</html>

