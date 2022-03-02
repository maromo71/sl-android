package com.example.sistemadecompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox checkArroz, checkFeijao, checkLeite, checkCarne, checkCoca;
    Button btnTotalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buscar os controles na view
        checkArroz = findViewById(R.id.checkArroz);
        checkCarne = findViewById(R.id.checkCarne);
        checkLeite = findViewById(R.id.checkLeite);
        checkCoca = findViewById(R.id.checkCoca);
        checkFeijao = findViewById(R.id.checkFeijao);
        btnTotalizar = findViewById(R.id.buttonTotalizar);

        //listener para o botão totalizar (btnTotalizar)
        btnTotalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0.0;
                if(checkArroz.isChecked()) total+=11.89;
                if(checkLeite.isChecked()) total+=4.0;
                if(checkCarne.isChecked()) total+=56.0;
                if(checkFeijao.isChecked())total+=8.30;
                if(checkCoca.isChecked())total+=4.0;
                //alerta para uma caixa de dialogo
                AlertDialog.Builder cx = new AlertDialog.Builder(MainActivity.this);
                cx.setTitle("Total da Compra");
                cx.setMessage("R$ " + total);
                cx.setNeutralButton("OK", null);
                cx.show();

            }
        });
    }
}