package com.example.zastavka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class onboard1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard1);
    }
    public void onClick(View v){
        Intent intent = new Intent(this, onboard2.class);
        startActivity(intent);
    }
}