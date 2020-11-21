package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txvRes = findViewById(R.id.txvRes);
        final EditText ernum1 = findViewById(R.id.ernum1);
        final EditText ernum2 = findViewById(R.id.ernum2);
        Button btnadd = findViewById(R.id.btnAdd);
        Button btnsub = findViewById(R.id.btnsub);
        Button btndiv = findViewById(R.id.btndiv);
        Button btnmulti = findViewById(R.id.btnmulti);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(ernum1.getText().toString());
                int Num2 = Integer.parseInt(ernum2.getText().toString());
                int result = Num1 + Num2;
                txvRes.setText(String.valueOf(result));
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(ernum1.getText().toString());
                int Num2 = Integer.parseInt(ernum2.getText().toString());
                int result = Num1 - Num2;
                txvRes.setText(String.valueOf(result));
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    btndiv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int Num1 = Integer.parseInt(ernum1.getText().toString());
                            int Num2 = Integer.parseInt(ernum2.getText().toString());
                            int result = Num1 / Num2;
                            txvRes.setText(String.valueOf(result));
                        }
                    });
                } catch (Exception Ex) {
                    Toast.makeText(MainActivity.this, "Divide By Zero", Toast.LENGTH_SHORT).show();
                }

            }
        });


        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1 = Integer.parseInt(ernum1.getText().toString());
                int Num2 = Integer.parseInt(ernum2.getText().toString());
                int result = Num1 * Num2;
                txvRes.setText(String.valueOf(result));
            }
        });
    }
}