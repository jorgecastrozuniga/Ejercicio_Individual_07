package com.example.ejercicio_individual_07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast mytoast = Toast.makeText(getApplicationContext(), "Bienvenidos a la aplicacion ", Toast.LENGTH_LONG);
        mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
        mytoast.show();
    }
}