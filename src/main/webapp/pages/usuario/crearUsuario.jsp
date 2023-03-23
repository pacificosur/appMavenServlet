
<jsp:include page="../layout/header.jsp"></jsp:include>

    <div class="card text-center">
        <div class="card-header">
            CREACIÓN DE REGISTRO DE USUARIO
        </div>
        <div class="card-body">
            <form action="${pageContext.request.contextPath}/UsuarioServlet?accion=crear" method="POST">
                <div class="form-group">
                    <label for="nombreLabel">Nombre</label>
                    <input type="text" name="name" class="form-control" id="nombreLabel" aria-describedby="emailHelp" placeholder="Nombre">
                </div>
                <div class="form-group">
                    <label for="passwordLabel">Password</label>
                    <input type="password" name="password" class="form-control" id="passwordLabel" placeholder="Contraseña">
                </div>
           
                <button type="submit" class="btn btn-primary btn-block">Guardar Registro</button>
            </form>
        </div>
        <div class="card-footer text-muted">
            UNIVERSIDAD DE LA SIERRA SUR
        </div>
    </div>

<jsp:include page="../layout/footer.jsp"></jsp:include>
