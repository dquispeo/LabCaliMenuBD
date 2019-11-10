package pe.dquispe.labcalimenubd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pe.dquispe.labcalimenubd.model.Nota;
import pe.dquispe.labcalimenubd.repositories.NotaRepository;

public class RegistrarNotaActivity extends AppCompatActivity {

    private EditText txtTitulo,txtDetalles,txtFecha,txtFavorito,txtArchicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_nota);

        txtTitulo = (EditText)findViewById(R.id.txt_crea_titulo);
        txtDetalles = (EditText)findViewById(R.id.txt_crea_detalles);
        txtFecha= (EditText)findViewById(R.id.txt_crea_fecha);
        txtFavorito= (EditText)findViewById(R.id.txt_crea_favorito);
        txtArchicar= (EditText)findViewById(R.id.txt_crea_archivar);

    }

    public void callRegister(View view){
        String titulotxt = txtTitulo.getText().toString();
        String detallestxt = txtDetalles.getText().toString();
        String fechatxt = txtFecha.getText().toString();
        String favoritotxt = txtFavorito.getText().toString();
        String archivartxt = txtArchicar.getText().toString();
        if(titulotxt.isEmpty() || detallestxt.isEmpty()){
            Toast.makeText(this, "Debes completar los campos", Toast.LENGTH_SHORT).show();
            return;
        }
        NotaRepository.create(titulotxt,detallestxt,favoritotxt,archivartxt,fechatxt);
        finish();
    }
}
