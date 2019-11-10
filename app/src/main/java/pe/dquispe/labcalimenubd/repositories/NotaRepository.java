package pe.dquispe.labcalimenubd.repositories;

import android.util.Log;

import com.orm.SugarRecord;

import java.util.List;

import pe.dquispe.labcalimenubd.model.Nota;

public class NotaRepository {

    public static List<Nota> list(){
        List<Nota> notas = SugarRecord.listAll(Nota.class);
        return notas;
    }

    public static Nota read(Long id){
        Nota nota=SugarRecord.findById(Nota.class, id);
        return nota;
    }

    public static void create(String titulo, String detalles, String favorito, String archivar, String fecha){
        Nota nota = new Nota(titulo, detalles, favorito, archivar, fecha);
        SugarRecord.save(nota);
    }

    public static void update(String titulo, String detalles, String favorito, String archivar, String fecha, Long id){
        Nota nota = SugarRecord.findById(Nota.class, id);
        nota.setTitulo(titulo);
        nota.setDetalles(detalles);
        nota.setFavorito(favorito);
        nota.setArchivado(archivar);
        nota.setFecha(fecha);
        SugarRecord.save(nota);
    }

    public static void delete(Long id){
        Nota nota = SugarRecord.findById(Nota.class, id);
        SugarRecord.delete(nota);
    }
}
