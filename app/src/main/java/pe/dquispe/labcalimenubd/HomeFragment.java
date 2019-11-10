package pe.dquispe.labcalimenubd;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

import pe.dquispe.labcalimenubd.adapter.NotaAdapter;
import pe.dquispe.labcalimenubd.model.Nota;
import pe.dquispe.labcalimenubd.repositories.NotaRepository;

public class HomeFragment extends Fragment {

    private static final int REGISTER_FORM_REQUEST = 100;
    private RecyclerView notesList;
    private FloatingActionButton btnAñadir;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        btnAñadir=v.findViewById(R.id.btnregistrar_nota_button);

        btnAñadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getContext(), RegistrarNotaActivity.class), REGISTER_FORM_REQUEST);
            }
        });

        // Configure ReciclerView
        notesList = (RecyclerView) v.findViewById(R.id.recyclerviewidhome);
        notesList.setLayoutManager(new LinearLayoutManager(getContext()));

        // Set Data Adapter to ReciclerView
        List<Nota> notas = NotaRepository.list();
        notesList.setAdapter(new NotaAdapter(notas));

        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // refresh data
        NotaAdapter adapter = (NotaAdapter) notesList.getAdapter();
        List<Nota> notas = NotaRepository.list();
        adapter.setNotas(notas);
        adapter.notifyDataSetChanged();
    }
}
