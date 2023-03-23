
package model;

import entity.Usuario;
import java.util.List;

public interface IUsuarioModel {
    public void crearRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public void eliminarRegistro(entity.Usuario usuario);
    public Usuario obtenerRegistro(int id);
    public void actualizarRegistro(Usuario usuario);
}
