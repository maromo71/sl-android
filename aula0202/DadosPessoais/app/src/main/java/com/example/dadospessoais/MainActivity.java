package com.example.dadospessoais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view) {
        EditText fieldNome = findViewById(R.id.editNome);
        TextInputEditText fieldEmail = findViewById(R.id.editEmail);
        TextView textResultado = findViewById(R.id.textResultado);

        String nome = fieldNome.getText().toString();
        String email = fieldEmail.getText().toString();

        String resultado = "Nome: " + nome + "\n" + "Email: " + email;
        textResultado.setText(resultado);
    }
}