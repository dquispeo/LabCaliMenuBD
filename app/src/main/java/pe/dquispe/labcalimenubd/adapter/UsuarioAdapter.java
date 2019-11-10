package pe.dquispe.labcalimenubd.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pe.dquispe.labcalimenubd.R;
import pe.dquispe.labcalimenubd.model.Nota;
import pe.dquispe.labcalimenubd.model.Usuario;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.ViewHolder> {
    private List<Usuario> usuarios;
    public UsuarioAdapter(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nota, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Usuario usuario = this.usuarios.get(position);
        viewHolder.txtUsuario.setText(usuario.getUsuario());
        viewHolder.txtNombre.setText(usuario.getNombre());
        viewHolder.txtEmail.setText(usuario.getEmail());
        viewHolder.txtContraseña.setText(usuario.getContraseña());
    }

    @Override
    public int getItemCount() {
        return this.usuarios.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtUsuario;
        public TextView txtNombre;
        public TextView txtEmail;
        public TextView txtContraseña;
        public ViewHolder(View itemView) {
            super(itemView);
            txtUsuario = (TextView) itemView.findViewById(R.id.txt_usuario);
            txtNombre = (TextView) itemView.findViewById(R.id.txt_nombre);
            txtEmail = (TextView) itemView.findViewById(R.id.txt_email);
            txtContraseña = (TextView) itemView.findViewById(R.id.txt_contraseña);
        }
    }
}
