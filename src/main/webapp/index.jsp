<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/et.css">
<title>Teste Servlets</title>
</head>
<form action="pessoa" method="post">
	<body>
		<div align="center">
			<table border="1">
				<tr>
					<td><input type="number" id="id" name="id"
					placeholder="ID" min="1" step="1" max="8000"
					required="required"><td/>
					
					<td><input type="text" id="nome" name="nome"
					placeholder="NOME" required="required"
					value="<c:out value="${pessoa.nome}"></c:out>"><td/>
					
					<td><input type="submit" id="enviar" name="enviar"
					value="ENVIAR" required="required"><td/>
				<tr/>
			<table/>
		<div/>
		<br />
		<!--  
		< 
			int i = 0;
		for(int j = 0; j < 10; j++){
			out.println(i * 2);
			i++;
			%>
			<br />
			<
		}
		%>
		
		-->
		<div>
		<!-- 
			<c:if test="${ empty pessoa }">
				<p>Sem Pessoa<p/>
			</c:if>
			-->
			<c:if test="${not empty pessoa}">
				<c:out value="${pessoa.nome}"></c:out>
			</c:if>
		<div/>
		<br />
		<div>
			<c:if test="${not empty pessoas}">
			<table border="1">
				<thead>
					<tr>
						<th><b>id<b><th/>
						<th><b>nome<b><th/>
					</tr>
				<thead/>
				<tbody>
				<c:forEach items="${pessoas}" var="p">
				<tr>
					<td>
					<c:out value="${p.id} "></c:out>
					<td/>
					<td>
					<c:out value="${p.nome} "></c:out>
					<td/>
				<tr/>
				</c:forEach>
				</tbody>
			<table/>
			</c:if>
		</div>
	</body>
<form/>
</html>