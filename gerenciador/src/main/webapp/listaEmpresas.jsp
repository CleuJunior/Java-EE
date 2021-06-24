<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List, br.com.alura.grenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE hmtl>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
    Lista de empresas: <br />

    <ul>
        <c:forEach items="${empresas}" var="empresa">
            <li>${empresa.nome}</li>
        </c:forEach>
    </ul>

</body>
</html>