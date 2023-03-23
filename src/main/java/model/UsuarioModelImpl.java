
package model;

import entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsuarioModelImpl implements IUsuarioModel{
    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }  

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> listaUsuario = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaUsuario = s.createCriteria(Usuario.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaUsuario;
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(usuario);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public Usuario obtenerRegistro(int id) {
        Usuario usuario = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            usuario = s.get(Usuario.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return usuario;
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
}
