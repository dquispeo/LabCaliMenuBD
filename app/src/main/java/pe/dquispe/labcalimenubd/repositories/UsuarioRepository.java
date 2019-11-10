package pe.dquispe.labcalimenubd.repositories;

import com.orm.SugarRecord;

import java.util.List;

import pe.dquispe.labcalimenubd.model.Nota;
import pe.dquispe.labcalimenubd.model.Usuario;

public class UsuarioRepository {
    public static List<Usuario> listusu(){
        List<Usuario> usuarios = SugarRecord.listAll(Usuario.class);
        return usuarios;
    }

    public static Usuario readusu(Long id){
        Usuario usuario=SugarRecord.findById(Usuario.class, id);
        return usuario;
    }

    public static void create(String usuario, String nombre, String email, String contraseña){
        Usuario usuarioo = new Usuario(usuario, nombre, email, contraseña);
        SugarRecord.save(usuarioo);
    }

    public static void update(String usuario, String nombre, String email, String contraseña, Long id){
        Usuario usuarioo = SugarRecord.findById(Usuario.class, id);
        usuarioo.setUsuario(usuario);
        usuarioo.setNombre(nombre);
        usuarioo.setEmail(email);
        usuarioo.setContraseña(contraseña);
        SugarRecord.save(usuarioo);
    }

    public static void delete(Long id){
        Nota nota = SugarRecord.findById(Nota.class, id);
        SugarRecord.delete(nota);
    }
}
