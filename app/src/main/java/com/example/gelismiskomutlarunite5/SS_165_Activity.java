package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_165_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Button btn1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_165_activity);
         btn1  = findViewById(R.id.button4);
         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 topla();
             }
         });
    }

    private void topla() {
        int topla = 15 + 15;
        Toast.makeText(this, "Topla:" + topla, Toast.LENGTH_SHORT).show();
    }

}
