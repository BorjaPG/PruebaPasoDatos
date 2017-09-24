package com.bp.pruebapasodatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    TextView user;
    TextView pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        user = (TextView) findViewById(R.id.userLogin);
        pass = (TextView) findViewById(R.id.userPass);

        /*Se crea un nuevo intent y se recupera el de la clase anterior*/
        Intent i = getIntent();
        user.setText(i.getStringExtra("user")); // Con getStringExtra y mediante el nombre recuperamos el recurso.
        pass.setText(i.getStringExtra("pass"));
    }
}
