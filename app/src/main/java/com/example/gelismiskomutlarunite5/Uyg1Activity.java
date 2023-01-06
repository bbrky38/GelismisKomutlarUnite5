package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Button btn1, btn2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selamver();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selamver();
            }
        });

    }

    private void selamver()
    {
        Toast.makeText(this,"SelamunAleyküm",Toast.LENGTH_LONG).show();
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg1Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
