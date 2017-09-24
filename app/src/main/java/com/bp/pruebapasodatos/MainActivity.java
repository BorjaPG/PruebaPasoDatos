package com.bp.pruebapasodatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private Button conect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        conect = (Button) findViewById(R.id.conect);

        conect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Se crea un nuevo intent y se indica la clase actual y la actividad destino*/
                Intent i = new Intent(MainActivity.this,ActivityB.class);
                i.putExtra("user",user.getText().toString()); //Mediante putExtra se pasa el valor a la otra actividad
                i.putExtra("pass", pass.getText().toString()); //Se utiliza getText para recuperar el texto del editText.
                startActivity(i);
            }
        });
    }
}
