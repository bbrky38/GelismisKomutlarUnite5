package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_173_Activity extends AppCompatActivity {

    EditText textName, textSurname;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_173_activity);
        textName = findViewById(R.id.textName);
        textSurname = findViewById(R.id.textSurname);
    }

    public void btnHey1(View view) {
        Toast.makeText(this, " Merhaba " + textName.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    public void btnHey2(View view) {
        Toast.makeText(this, " İyi Günler " + textName.getText().toString() + " " + textSurname.getText().toString() , Toast.LENGTH_SHORT).show();
    }
}
