package controller;

import entity.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UsuarioServiceImpl;
import service.IUsuarioService;

public class UsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cadena = request.getParameter("accion");

        switch (cadena) {
            case "crear":
                crear(request, response);
                break;
            case "listar":
                listar(request, response);
                break;
            case "eliminar":
                eliminar(request, response);
                break;
            case "actualizarFormulario":
                actualizarFormulario(request, response);
                break;
            case "actualizar":
                actualizar(request, response);
                break;
            default:
                break;
        }
    }

    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/listarUsuario.jsp");
        
        IUsuarioService service = new UsuarioServiceImpl();
        List<Usuario> listaUSuario = service.obtenerRegistros();
        request.setAttribute("listaUSuario", listaUSuario);
        
        dispatcher.forward(request, response);
    }

    private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/listarUsuario.jsp");
        
        Usuario usuario = new Usuario();
        usuario.setName(request.getParameter("name"));
        usuario.setPassword(request.getParameter("password"));
        
        IUsuarioService service = new UsuarioServiceImpl();
        service.crearRegistro(usuario);
        
        List<Usuario> listaUSuario = service.obtenerRegistros();
        request.setAttribute("listaUSuario", listaUSuario);
        
        dispatcher.forward(request, response);
    }
    
    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/listarUsuario.jsp");

        int id = Integer.parseInt(request.getParameter("id"));

        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = service.obtenerRegistro(id);
        service.eliminarRegistro(usuario);
        
        List<Usuario> listaUSuario = service.obtenerRegistros();
        request.setAttribute("listaUSuario", listaUSuario);
        
        dispatcher.forward(request, response);

    }
    
    private void actualizarFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/actualizarUsuario.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
       
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = service.obtenerRegistro(id);
        
        request.setAttribute("usuario", usuario);
        
        dispatcher.forward(request, response);
    }
    
    private void actualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/usuario/listarUsuario.jsp");
        
        Usuario usuario = new Usuario();
        usuario.setId(Integer.valueOf(request.getParameter("id")));
        usuario.setName(request.getParameter("name"));
        usuario.setPassword(request.getParameter("password"));
        
        IUsuarioService service = new UsuarioServiceImpl();
        service.actualizarRegistro(usuario);
        
        List<Usuario> listaUSuario = service.obtenerRegistros();
        request.setAttribute("listaUSuario", listaUSuario);
        
        dispatcher.forward(request, response);
    }    
}
