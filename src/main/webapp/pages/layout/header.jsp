<%-- 
    Document   : footer
    Created on : 22 mar 2023, 17:08:11
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/font-awesome/6.3.0/css/all.min.css"/>
        <title>Header</title>        
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-item nav-link active" href="${pageContext.request.contextPath}/pages/index.jsp">Home <span class="sr-only">(current)</span></a>
                        <a class="nav-item nav-link" href="${pageContext.request.contextPath}/pages/usuario/crearUsuario.jsp">Crear Usuario</a>
                        <a class="nav-item nav-link disabled" href="#">Quiénes somos</a>
                    </div>
                </div>
            </nav>