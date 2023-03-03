package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_uyg5Activitiy extends AppCompatActivity {

    Button btnHesapla;
    EditText editTextCihazAdi , editTextKW , editTextGünlükKullanımSaat;
    TextView textViewSonuc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);
    }
        public void onClick(View view){
            EditText editTextCihazAdi = findViewById(R.id.editTextCihazAdi);
            EditText editTextKW = findViewById(R.id.editTextKW);
            EditText editTextGunlukKullanimSaat = findViewById(R.id.editTextGünlükKullanımSaat);

            TextView textViewSonuc = findViewById(R.id.textViewSonuc);
            String cihazAdi = editTextCihazAdi.getText().toString();
            int kw = Integer.parseInt(editTextKW.getText().toString());
            int saat = Integer.parseInt(editTextGunlukKullanimSaat.getText().toString());



        }
    }

