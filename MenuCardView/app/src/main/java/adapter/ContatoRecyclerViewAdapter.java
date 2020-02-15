package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import br.digitalhouse.menuscardview.R;
import model.Contato;

public class ContatoRecyclerViewAdapter extends RecyclerView.Adapter<ContatoRecyclerViewAdapter.ViewHolder> {

    private List<Contato> contatos;

    public ContatoRecyclerViewAdapter (List<Contato> listaContatos){
        this.contatos = listaContatos;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_contatos_recycler_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contato contato = contatos.get(position);
        holder.onBind(contato);
    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }

    //Classe View Holder
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nomeContato;
        private TextView telefoneContato;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeContato = itemView.findViewById(R.id.text_view_nome);
            telefoneContato = itemView.findViewById(R.id.text_view_telefone);

        }

        public void onBind (Contato contato){
            nomeContato.setText(contato.getNome());
            telefoneContato.setText(contato.getTelefone());
        }

    }
}
