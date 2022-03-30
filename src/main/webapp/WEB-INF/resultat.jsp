<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Résultat</title>
</head>
<body>
	<h1>Choix du joueur</h1>
	<h2><%=request.getAttribute("choixJoueur")%></h2>
	<h1>Choix CPU</h1>
	<h2><%=request.getAttribute("choixCPU")%></h2>
	<h1>Résultat</h1>
	<h2><%=request.getAttribute("resultat")%></h2>

	<a href="./">Rejouer ?</a>


</body>
</html>