package com.example.checkingnumber;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ArmstrongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armstrong);

        EditText etNumber = findViewById(R.id.etNumber);
        Button btnCheck = findViewById(R.id.btnCheck);
        TextView tvResult = findViewById(R.id.tvResult);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(etNumber.getText().toString());
                boolean result = isArmstrong(number);
                tvResult.setText(result ? "Yes, it's an Armstrong number!" : "No, it's not an Armstrong number.");
            }
        });
    }

    private boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        int digits = String.valueOf(number).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == number;
    }
}
