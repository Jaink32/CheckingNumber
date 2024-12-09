package com.example.checkingnumber;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AutomorphicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automorphic);

        EditText etNumber = findViewById(R.id.etNumber);
        Button btnCheck = findViewById(R.id.btnCheck);
        TextView tvResult = findViewById(R.id.tvResult);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(etNumber.getText().toString());
                boolean result = isAutomorphic(number);
                tvResult.setText(result ? "Yes, it's an Automorphic number!" : "No, it's not an Automorphic number.");
            }
        });
    }

    private boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }
}
