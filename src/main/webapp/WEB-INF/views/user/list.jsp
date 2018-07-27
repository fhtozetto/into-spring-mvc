<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- jstl: é a mais comum, (foreach, etc)  -->
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %> <!-- jstl: taglib para formatações (Data, valor monetário, etc)-->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> <!-- SpringFramworks: taglib do String -->
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de Usuários</title>
    <link type="text/css" rel="stylesheet" href="${css }"/>
</head>
<body>
<div class="container">
    <h1>Lista de Usuários</h1>
    <hr>
    <div>

		<spring:url value="/usuario/cadastro" var="cadastro"/>
        <a class="btn btn-default" href="${cadastro }">Novo Usuário</a>
    </div>
    <hr>

    <div class="${message == null ? 'panel-default' : 'panel-success'}">

        <div class="panel-heading">
            <span>${message == null ? '&nbsp;' : message}</span>
        </div>

        <table class="table table-striped table-condensed">
            <thead>
            <tr>
                <th>ID</th>
                <th>NOME</th>
                <th>DATA NASCIMENTO</th>
                <th>AÇÃO</th> 
            </tr>
            </thead>
            <tbody>
            <c:forEach var="usuario" items="${usuarios}">
                <tr>
                    <td>${usuario.id}</td>
                    <td>${usuario.nome}&nbsp;${usuario.sobrenome}</td>
                    <td>
                    	<f:parseDate var="date" value="${usuario.dtNascimento}" pattern="yyyy-MM-dd" type="date"/>
                    	<f:formatDate value="${date}" pattern="dd/MM/yyyy"/>
                    </td>
                    <td>  
                    	<spring:url value="/usuario/update/${usuario.id}" var="update"/>
                        <a class="btn btn-info" href="${update}">Editar</a>
                        <spring:url value="/usuario/delete/${usuario.id}" var="delete"/>
                        <a class="btn btn-danger" href="${delete}" >Excluir</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <hr>
    <footer class="footer">
        <p>&copy; 2018 - LPH-Info</p>
    </footer>
</div>
</body>
</html>