package pe.dquispe.labcalimenubd.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import pe.dquispe.labcalimenubd.R;
import pe.dquispe.labcalimenubd.model.Nota;

public class NotaAdapter extends RecyclerView.Adapter<NotaAdapter.ViewHolder>  {
    private List<Nota> notas;
    public NotaAdapter(List<Nota> notas){
        this.notas = notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nota, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Nota nota = this.notas.get(position);
        viewHolder.titulo.setText(nota.getTitulo());
        viewHolder.detalles.setText(nota.getDetalles());
        viewHolder.favorito.setText(nota.getFavorito());
        viewHolder.archivar.setText(nota.getArchivado());
        viewHolder.fecha.setText(nota.getFecha());
    }

    @Override
    public int getItemCount() {
        return this.notas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView titulo;
        public TextView detalles;
        public TextView favorito;
        public TextView archivar;
        public TextView fecha;
        public ViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView) itemView.findViewById(R.id.txt_titulo);
            detalles = (TextView) itemView.findViewById(R.id.txt_detalles);
            favorito = (TextView) itemView.findViewById(R.id.txt_favorito);
            archivar = (TextView) itemView.findViewById(R.id.txt_archivar);
            fecha = (TextView) itemView.findViewById(R.id.txt_fecha);
        }
    }

}
