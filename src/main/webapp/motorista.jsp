<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="br.com.connectcargas.model.Motorista"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
	List<Motorista> motorista = (List<Motorista>) request.getAttribute("motorista");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>Id</td>
				<td>Nome</td>
			</tr>
		</thead>
		<tbody>
			<%
				for (Motorista motorista : motorista) {
			%>
			<tr>
				<td><%=motorista.getId()%></td>
				<td><%=motorista.getNome()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>