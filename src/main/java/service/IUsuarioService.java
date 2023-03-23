
package service;

import entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    public void crearRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public void eliminarRegistro(Usuario usuario);
    public Usuario obtenerRegistro(int id);
    public void actualizarRegistro(Usuario usuario);
}
