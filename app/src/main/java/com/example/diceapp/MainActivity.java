package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView left3, right3;
    TextView textView;
    Button high;
    Button low;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left3= findViewById(R.id.left3);
        right3= findViewById(R.id.right3);
        high= findViewById(R.id.high);
        int [] dicearray= {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};
        low= findViewById(R.id.low);
        int [] dicearray2= {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randNumLeft = rand.nextInt(6);
                int randNumRight= rand.nextInt(6);
                left3.setImageResource(dicearray[randNumLeft]);
                right3.setImageResource(dicearray[randNumRight]);
                if (randNumLeft>randNumRight) {
                    TextView textView= findViewById(R.id.textView);
                    textView.setText("USER WIN!");
                }
                else if(randNumLeft<randNumRight){
                    TextView textView= findViewById(R.id.textView);
                    textView.setText("COMPUTER WIN!");
                }
                else {
                    TextView textView= findViewById(R.id.textView);
                    textView.setText("IT'S A TIE");
                }

            }
        });
        low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randNumLeft = rand.nextInt(6);
                int randNumRight= rand.nextInt(6);
                left3.setImageResource(dicearray2[randNumLeft]);
                right3.setImageResource(dicearray2[randNumRight]);
                if (randNumLeft<randNumRight){
                    TextView textView= findViewById(R.id.textView);
                    textView.setText("USER WIN!");
                }
                else if(randNumLeft>randNumRight){
                    TextView textView= findViewById(R.id.textView);
                    textView.setText("COMPUTER WIN!");
                }
                else {
                    TextView textView= findViewById(R.id.textView);
                    textView.setText("IT'S A TIE");
                }
            }
        });




    }
}