package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    public Uyg10_Asker asker;
    public Uyg10_Tank tankci;
    String mesaj = "";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
            asker = new Uyg10_Asker();
            tankci = new Uyg10_Tank();

            TextView textViewMesaj = findViewById(R.id.textViewMesaj);
            Button buttonAsker = findViewById(R.id.buttonAsker);
            Button buttonTankci = findViewById(R.id.buttonTankci);

            buttonAsker.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mesaj = asker.atesEt();
                    textViewMesaj.setText(mesaj);
                }
            });
            buttonTankci.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mesaj = tankci.atesEt();
                    textViewMesaj.setText(mesaj);
                }
            });
        }
    }


