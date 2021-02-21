package com.sarthak.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private Button makeItRain;
    private TextView moneyValue;
    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeItRain = findViewById(R.id.buttonMakeItRain);
        moneyValue = findViewById(R.id.moneyValue);
    }

    public void makeRicher(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        if (moneyCounter >= 20000) {
            moneyValue.setTextColor(Color.RED);
        }
        moneyValue.setText(numberFormat.format(moneyCounter));
    }

    public void showInfo(View view) {
        Snackbar.make(moneyValue, R.string.app_info, Snackbar.LENGTH_LONG).show();
    }
}