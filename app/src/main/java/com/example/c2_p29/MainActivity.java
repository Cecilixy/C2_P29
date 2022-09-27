package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button burger;
    Button taco;
    Button pizza;
    Button coke;
    Button steak;
    Button lettuce;
    TextView calories;
    Integer cal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        burger = (Button) findViewById(R.id.burger);
        taco = (Button) findViewById(R.id.taco);
        pizza = (Button) findViewById(R.id.pizza);
        coke = (Button) findViewById(R.id.coke);
        steak = (Button) findViewById(R.id.steak);
        lettuce = (Button) findViewById(R.id.lettuce);
        calories = (TextView) findViewById(R.id.calories);

        burger.setOnClickListener(this);
        taco.setOnClickListener(this);
        pizza.setOnClickListener(this);
        coke.setOnClickListener(this);
        steak.setOnClickListener(this);
        lettuce.setOnClickListener(this);

        cal = 0;



    }

    @Override
    public void onClick(View view){
        if (view.getId() == R.id.burger){
            cal += 295;
            calories.setText(cal.toString());
        }
        else if (view.getId() == R.id.taco){
            cal += 226;
            calories.setText(cal.toString());
        }
        else if (view.getId() == R.id.pizza){
            cal += 266;
            calories.setText(cal.toString());
        }
        else if (view.getId() == R.id.coke){
            cal += 100;
            calories.setText(cal.toString());
        }
        else if (view.getId() == R.id.steak){
            cal += 270;
            calories.setText(cal.toString());
        }
        else if (view.getId() == R.id.lettuce){
            cal += 15;
            calories.setText(cal.toString());
        }
    }
}