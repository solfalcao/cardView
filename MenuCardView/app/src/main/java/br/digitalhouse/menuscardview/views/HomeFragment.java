package br.digitalhouse.menuscardview.views;


import android.os.Bundle;

import adapter.ContatoRecyclerViewAdapter;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import br.digitalhouse.menuscardview.R;
import model.Contato;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView recyclerViewContato;
    private ContatoRecyclerViewAdapter adapter;



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerViewContato = view.findViewById(R.id.recycler_view_contatos);
        adapter = new ContatoRecyclerViewAdapter(getListaContatos());

        recyclerViewContato.setAdapter(adapter);
        recyclerViewContato.setLayoutManager(new GridLayoutManager(getContext(),5));

        return view;
    }

    private List<Contato> getListaContatos(){
        List<Contato> contatos = new ArrayList<>();

        contatos.add (new Contato("Karol", "1111-1111"));
        contatos.add (new Contato("Henrique", "1222-1111"));
        contatos.add (new Contato("Sol", "2333-1111"));
        contatos.add (new Contato("Ingrid", "1441-1111"));

        return contatos;
    }

}
