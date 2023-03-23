<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../layout/header.jsp"></jsp:include>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Contraseña</th>
                <th>Actualizar</th>
                <th>Eliminar</th> 
            </tr>

        </thead>
        <c:forEach var="usuario" items="${listaUSuario}">
            <tr>
                <td><c:out value="${usuario.id}"></c:out></td>
                <td><c:out value="${usuario.name}"></c:out></td>
                <td><c:out value="${usuario.password}"></c:out></td>
                <td><a href="${pageContext.request.contextPath}/UsuarioServlet?accion=actualizarFormulario&id=<c:out value="${usuario.id}"></c:out>">Actualizar</a></td>
                <td><a href="${pageContext.request.contextPath}/UsuarioServlet?accion=eliminar&id=<c:out value="${usuario.id}"></c:out>">Eliminar</a></td>
            </tr>
        </c:forEach>
</table>

<jsp:include page="../layout/footer.jsp"></jsp:include>