package br.com.digitalhouse.reviewandsharedpreferences.login.view;

import android.content.SharedPreferences;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import br.com.digitalhouse.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutSenha;
    private Switch switchLembrar;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        SharedPreferences preferences = getSharedPreferences("APP", MODE_PRIVATE);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }

    private void initView() {
        textInputLayoutEmail = findViewById(R.id.textInputLayoutEmail);
        textInputLayoutSenha = findViewById(R.id.textInputLayoutSenha);
        switchLembrar = findViewById(R.id.switchLembrar);
        btnEntrar = findViewById(R.id.btnEntrar);
    }
}
