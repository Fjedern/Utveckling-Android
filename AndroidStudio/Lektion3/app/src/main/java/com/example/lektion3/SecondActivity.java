package com.example.lektion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_receive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_receive = findViewById(R.id.tv_recieve);

        Intent intent = getIntent();
        AnInteger anInt = (AnInteger) intent.getSerializableExtra("AnInteger");
        tv_receive.setText(anInt.getI());
    }
}