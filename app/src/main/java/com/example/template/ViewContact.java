package com.example.template;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ViewContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_contact);
        Button editbtn = findViewById(R.id.EditBtn);
        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewContact.this,EditView.class);
                startActivity(intent);
            }

        });
        Button delect = findViewById(R.id.Delbtn);
        delect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showExitDialog();
            }
        });

    }

    private void showExitDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_alert2);
        dialog.getWindow().setBackgroundDrawable(
                new ColorDrawable(Color.rgb(128,128,128)));
        dialog.setCancelable(true);

        Button yes_btn = dialog.findViewById(R.id.DelectBtn);
        Button No = dialog.findViewById(R.id.NoBtn);

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();


    }
}