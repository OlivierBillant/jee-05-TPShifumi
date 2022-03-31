<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Faites vos jeux</title>
</head>
<body>
	<h1>TENTATIVE</h1>
	<form action="./Traitement" name="choix" method="POST">
		<button name="choix" value="Pierre">Pierre</button>
	</form>

	<form action="./Traitement" name="choix" method="POST">
		<button name="choix" value="Feuille">Feuille</button>
	</form>

	<form action="./Traitement" name="choix" method="POST">
		<button name="choix" value="Ciseaux">Ciseaux</button>
	</form>

</body>
</html>