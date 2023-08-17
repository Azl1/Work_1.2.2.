package com.abdullaev.work_122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button buttonNext = (Button) findViewById(R.id.buttonNext);
        Button buttonBack = (Button) findViewById(R.id.buttonBack);

        int a = 1;
        int b = 100;
        int random_number1 = a + (int) (Math.random() * b);
        String name = " http://myfile.org/<" + random_number1 + ">";
        textView2.setText(name);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        MainActivity.class);
                startActivity(intent);

            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}