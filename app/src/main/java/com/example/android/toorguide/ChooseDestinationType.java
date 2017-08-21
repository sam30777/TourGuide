package com.example.android.toorguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChooseDestinationType extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_destination_type);
        final TextView mall = (TextView) findViewById(R.id.place1);
        mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ChooseDestinationType.this, Malls.class);
                startActivity(x);
            }
        });
        TextView hist = (TextView) findViewById(R.id.place2);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(ChooseDestinationType.this, Historic.class);
                startActivity(y);
            }
        });
        TextView club = (TextView) findViewById(R.id.place3);
        club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(ChooseDestinationType.this, Clubs.class);
                startActivity(z);
            }
        });
        TextView food = (TextView) findViewById(R.id.place4);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(ChooseDestinationType.this, Food.class);
                startActivity(w);
            }
        });
        TextView Couple = (TextView) findViewById(R.id.place5);
        Couple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(ChooseDestinationType.this, Couples.class);
                startActivity(m);
            }
        });
    }
}
