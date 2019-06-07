package br.com.digitalhouse.reviewandsharedpreferences.detail.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import br.com.digitalhouse.myapplication.R;
import br.com.digitalhouse.reviewandsharedpreferences.home.view.HomeActivity;
import br.com.digitalhouse.reviewandsharedpreferences.model.Contact;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageViewAvatar = findViewById(R.id.circleImageViewAvatar);
        final TextInputLayout textViewName = findViewById(R.id.textInputLayoutName);
        final TextInputLayout textInputLayoutPhone = findViewById(R.id.textInputLayoutPhone);
        ImageButton buttonEdit = findViewById(R.id.buttonEdit);

        if (getIntent() != null && getIntent().getExtras() != null){
            final Contact contact = getIntent().getParcelableExtra("CONTACT");

            if (contact != null) {
                imageViewAvatar.setImageDrawable(ContextCompat.getDrawable(imageViewAvatar.getContext(), contact.getAvatar()));
                textViewName.setHint(contact.getName());
                textInputLayoutPhone.setHint(contact.getPhone());

                buttonEdit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contact.setName(textViewName.getEditText().getText().toString());
                        contact.setPhone(textInputLayoutPhone.getEditText().getText().toString());
                    }
                });
            }
        }
    }
}