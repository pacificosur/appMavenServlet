
package service;

import entity.Usuario;
import java.util.List;
import model.IUsuarioModel;
import model.UsuarioModelImpl;

public class UsuarioServiceImpl implements IUsuarioService{
    private IUsuarioModel model = new UsuarioModelImpl();
    @Override
    public void crearRegistro(Usuario usuario) {
        model.crearRegistro(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        model.eliminarRegistro(usuario);
    }

    @Override
    public Usuario obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        model.actualizarRegistro(usuario);
    }
}
