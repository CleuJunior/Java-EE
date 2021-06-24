<%
	String nomeEmpresa = (String) request.getAttribute("empresa");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Empresa <strong><%= nomeEmpresa %></strong> cadastrada com sucesso!

</body>
</html>