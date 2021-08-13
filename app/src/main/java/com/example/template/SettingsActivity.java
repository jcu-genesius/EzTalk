package com.example.template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button updateSettings = findViewById(R.id.updateSettingsBtn);
        Button cancelButton = findViewById(R.id.cancel);

        updateSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this,"Updated",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SettingsActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this,"Cancel",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SettingsActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });
    }
}