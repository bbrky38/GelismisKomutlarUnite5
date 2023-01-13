package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {

    Button btn1, btn2;
    EditText editText1 , editText2 , editText3;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        Button btn1 = findViewById(R.id.button1);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        TextView textView = findViewById(R.id.textView);

    }
        public void topla3sayi (View view)
        {
        int sayi1;
        sayi1 = Integer.parseInt(editText1.getText().toString());
        int sayi2;
        sayi2 = Integer.parseInt(editText2.getText().toString());
        int sayi3;
        sayi3 = Integer.parseInt(editText3.getText().toString());
        int sonuc = topla(sayi1, sayi2, sayi3);
        textView.setText("sonuç " + sonuc);
        }

    public void topla2sayi (View view)
    {
        int sayi1;
        sayi1 = Integer.parseInt(editText1.getText().toString());
        int sayi2;
        sayi2 = Integer.parseInt(editText2.getText().toString());
        int sonuc = topla(sayi1, sayi2);
        textView.setText("sonuç " + sonuc);
    }

    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    private int topla(int sayi1, int sayi2,int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }
}




