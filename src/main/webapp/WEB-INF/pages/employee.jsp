<%@ page import="com.springapp.mvc.model.Employee" %>
<%@ page import="java.util.List" %>
<html>
<body>
	<h1>${message}</h1>

	<%

		List<Employee> employees = (List<Employee>) request.getAttribute("empList");
		for (Employee employee : employees) {
			out.print("<table");
				out.print("<tr>");
					out.print("<td>");
						out.print(employee.getFirstname());
					out.print("</td>");
					out.print("<td>");
						out.print(employee.getLastname());
					out.print("</td>");
					out.print("<td>");
						out.print(employee.getEmail());
					out.print("</td>");
				out.print("</tr>");
			out.print("</table>");
			out.print(employee);
			out.print("<br>");
		}

	%>


</body>
</html>