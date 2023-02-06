<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="Usuario" type="model.Usuario" scope="request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OK First MVC App</title>
</head>
<body>
	<h1>Bem vindo</h1>
	<hr>
	Seu id : <strong>${Usuario.id}</strong> <br>
	Seu nome : <strong>${Usuario.fullname}</strong> <br>
	Seu username : <strong>${Usuario.username}</strong> <br>
	Seu email : <strong>${Usuario.email}</strong> <br>
	
</body>
</html>