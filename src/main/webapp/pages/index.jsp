<jsp:include page="layout/header.jsp"></jsp:include>

    <nav>
        <div class="ch-nav-bar nav-wrapper ">
            <a href="#" class="brand-logo">TEC WEB I</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="${pageContext.request.contextPath}/UsuarioServlet?accion=listar">Listar Usuario</a></li>
            <li><a href="${pageContext.request.contextPath}/pages/usuario/crearUsuario.jsp">Crear Usuario</a></li>                        
        </ul>
    </div>
</nav>

<jsp:include page="layout/footer.jsp"></jsp:include>