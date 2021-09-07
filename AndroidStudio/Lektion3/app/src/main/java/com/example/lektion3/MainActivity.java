package com.example.lektion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_goToSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_goToSecondActivity = findViewById(R.id.btn_goToSecondActivity);

        AnInteger anInt = new AnInteger(5);

        btn_goToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("AnInteger", anInt);
                startActivity(intent);

            }
        });

        Log.d("MainActivity", "Hello");

    }
}