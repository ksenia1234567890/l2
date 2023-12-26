package com.example.l2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private Button btn1;
    private boolean onOff = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //Находим кнопку по id
        btn1 = (Button) findViewById(R.id.buttonColor);

        //Изменение цвета кнопки по нажатию
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onOff) {
                    btn1.setBackgroundColor(Color.parseColor("#FF6750A3"));
                    onOff = false;
                }
                else {
                    btn1.setBackgroundColor(Color.parseColor("#33AF21"));
                    onOff = true;
                }
            }
        });
    }
}