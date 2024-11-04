package com.example.employee;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button employeeButton = findViewById(R.id.employeeButton);

        employeeButton.setOnClickListener(v -> {
            // Intent to navigate to EmployeeLoginActivity
            Intent intent = new Intent(MainActivity.this, EmployeeLoginActivity.class);
            startActivity(intent);  // Start the EmployeeLoginActivity
        });
    }
}
