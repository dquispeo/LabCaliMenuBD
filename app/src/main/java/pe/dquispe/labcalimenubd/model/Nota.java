package pe.dquispe.labcalimenubd.model;

import com.orm.dsl.Table;

@Table
public class Nota {
    private Long id;
    private String titulo;
    private String detalles;
    private String favorito;
    private String archivado;
    private String fecha;

    public Nota() {
    }

    public Nota(String titulo, String detalles, String favorito, String archivado, String fecha) {
        this.titulo = titulo;
        this.detalles = detalles;
        this.favorito = favorito;
        this.archivado = archivado;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public String getArchivado() {
        return archivado;
    }

    public void setArchivado(String archivado) {
        this.archivado = archivado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", detalles='" + detalles + '\'' +
                ", favorito='" + favorito + '\'' +
                ", archivado='" + archivado + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
