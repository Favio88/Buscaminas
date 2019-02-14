package com.favio.buscaminas;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtv_contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtv_contador= findViewById(R.id.txtv_contador);

        new CountDownTimer(7000, 1000){

            @Override
            public void onTick(long l) {

                txtv_contador.setText(Long.toString(l/1000));
            }

            @Override
            public void onFinish() {

                Intent itt_buscaminasActivity=new Intent(MainActivity.this, Buscaminas.class);
                startActivity(itt_buscaminasActivity);

                finish();
            }
        }.start();

    }
}
