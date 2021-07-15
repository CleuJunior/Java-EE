<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${ not empty empresa }">
		Empresa <strong>${ empresa }</strong> cadastrada com sucesso!
	</c:if>
	
	<c:if test="${ empty empresa }">
		Nenhuma empresa cadastrada!
	</c:if>
</body>
</html>