package br.com.digitalhouse.reviewandsharedpreferences.adapters;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.myapplication.R;
import br.com.digitalhouse.reviewandsharedpreferences.RecyclerViewClickListener;
import br.com.digitalhouse.reviewandsharedpreferences.model.Contact;

public class RecyclerViewContactAdapter extends RecyclerView.Adapter<RecyclerViewContactAdapter.ViewHolder> {

    private List<Contact> contacts;
    private RecyclerViewClickListener listener;

    public RecyclerViewContactAdapter(List<Contact> contacts, RecyclerViewClickListener listener) {
        this.contacts = contacts;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_recyclerview_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Contact contact = contacts.get(i);
        viewHolder.bind(contact);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(contact);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageViewAvatar;
        private TextView textViewName;
        private TextView textViewPhone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewAvatar = itemView.findViewById(R.id.imageViewFoto);
            textViewName = itemView.findViewById(R.id.textViewNome);
            textViewPhone = itemView.findViewById(R.id.textViewTelefone);
        }

        public void bind(Contact contact){
            imageViewAvatar.setImageDrawable(ContextCompat.getDrawable(imageViewAvatar.getContext(), contact.getAvatar()));
            textViewName.setText(contact.getName());
            textViewPhone.setText(contact.getPhone());
        }
    }
}
