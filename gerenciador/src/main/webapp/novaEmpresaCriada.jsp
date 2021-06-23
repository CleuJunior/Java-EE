<%
	String nome = "Teste JSP";
	System.out.println(nome);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Teste nome: <% out.println(nome); %>

</body>
</html>