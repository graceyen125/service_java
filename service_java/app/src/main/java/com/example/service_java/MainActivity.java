package com.example.service_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View View){
                    Intent intent = new Intent(MainActivity.this,MyService.class);
                    startService(intent);
                    Toast.makeText(MainActivity.this,"啟動SERVICE", Toast.LENGTH_LONG).show();
                    finish();
                }
        });
    }
}
