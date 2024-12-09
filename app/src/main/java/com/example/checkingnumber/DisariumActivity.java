package com.example.checkingnumber;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DisariumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disarium);

        EditText etNumber = findViewById(R.id.etNumber);
        Button btnCheck = findViewById(R.id.btnCheck);
        TextView tvResult = findViewById(R.id.tvResult);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(etNumber.getText().toString());
                boolean result = isDisarium(number);
                tvResult.setText(result ? "Yes, it's a Disarium number!" : "No, it's not a Disarium number.");
            }
        });
    }

    private boolean isDisarium(int number) {
        String numStr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, i + 1);
        }
        return sum == number;
    }
}
