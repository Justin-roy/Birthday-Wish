package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String Extra_NAME = "androidx.appcompat.app.AppCompatActivity.EtraNm";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void OpenActivity(View v)
    {
        //Toast.makeText(this, "Hello Going To Next Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        name = findViewById(R.id.editTextTextPersonName);
        String nameText = name.getText().toString();
        intent.putExtra(Extra_NAME,nameText);
        startActivity(intent);
    }
}