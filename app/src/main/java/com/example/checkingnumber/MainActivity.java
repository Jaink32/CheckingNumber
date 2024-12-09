package com.example.checkingnumber;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAutomorphic = findViewById(R.id.btnAutomorphic);
        Button btnArmstrong = findViewById(R.id.btnArmstrong);
        Button btnDisarium = findViewById(R.id.btnDisarium);

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AutomorphicActivity.class);
                startActivity(intent);
            }
        });

        btnArmstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ArmstrongActivity.class);
                startActivity(intent);
            }
        });

        btnDisarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisariumActivity.class);
                startActivity(intent);
            }
        });
    }
}
