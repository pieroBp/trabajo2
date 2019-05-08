package com.example.autonoma.ejercicio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUsuario, etClave;
    Button btnLogin;
  //  String nom,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        etUsuario= findViewById(R.id.edUsuario);
        etClave= findViewById(R.id.edClave);

        btnLogin=findViewById(R.id.btnLogin);
    final String nombre = etUsuario.getText().toString();
    final String pass = etClave.getText().toString();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logearse hardcode
                if(nombre.length() ==0){
                    Toast.makeText(
                            MainActivity.this,
                            "Ingrese usuario Correcto",
                            Toast.LENGTH_SHORT).show(); }
                if(pass.length() ==0){
                    Toast.makeText(
                            MainActivity.this,
                            "Ingrese password Correcto",
                            Toast.LENGTH_SHORT).show(); }

                    if(etUsuario.getText().toString().equals("piero") &&
                            etClave.getText().toString().equals("123")){
                        //
                        Intent intent = new Intent(
                                MainActivity.this,
                                ProfesoresActivity.class);

                        startActivity(intent);

                    }//if


            }//onclick
        });//setOnClickListener


    }
}
