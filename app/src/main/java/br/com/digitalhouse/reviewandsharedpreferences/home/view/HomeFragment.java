package br.com.digitalhouse.reviewandsharedpreferences.home.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.myapplication.R;
import br.com.digitalhouse.reviewandsharedpreferences.RecyclerViewClickListener;
import br.com.digitalhouse.reviewandsharedpreferences.adapters.RecyclerViewContactAdapter;
import br.com.digitalhouse.reviewandsharedpreferences.detail.view.DetailActivity;
import br.com.digitalhouse.reviewandsharedpreferences.model.Contact;

public class HomeFragment extends Fragment implements RecyclerViewClickListener {

    private RecyclerView recyclerView;
    private RecyclerViewContactAdapter adapter;

    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recyckerViewTeacher);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RecyclerViewContactAdapter(getContacts(), this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Nika", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Nika", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Nika", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Nika", "11 91111-1111", R.mipmap.ic_launcher));
        contacts.add(new Contact("Mateus", "11 91111-1111", R.mipmap.ic_launcher));

        return contacts;
    }

    @Override
    public void onClick(Contact contact) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        intent.putExtra("CONTACT", contact);
        startActivity(intent);
    }
}
