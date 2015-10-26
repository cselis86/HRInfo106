<%@ page import="com.springapp.mvc.model.Location" %>
<%@ page import="java.util.List" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: elis
  Date: 19/10/2015
  Time: 12:36 πμ
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Locations</title>
</head>
<body>

<h2>SHOW LOCATIONS</h2>

<%--<form:form method="post" action="addLoc" commandName="location">--%>
  <%--<table>--%>
    <%--<tr>--%>
      <%--<td>NAME</td>--%>
      <%--<td><form:input path="name"/></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
      <%--<td colspan="2">--%>
        <%--<input type="submit" value="Add"/>--%>
      <%--</td>--%>
    <%--</tr>--%>
  <%--</table>--%>
<%--</form:form>--%>

<h3>Locations</h3>

<table class="data" border="1">
  <tr>
    <th>LOC_ID</th>
    <th>NAME</th>
    <th>SELECT</th>

  </tr>
  <c:forEach items="${locList}" var="loc">
    <tr>
      <td>${loc.id}</td>
      <td>${loc.name}</td>
      <td style="text-align: center"><a href="getDeptByLocId/${loc.id}">#</a></td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
