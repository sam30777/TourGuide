package com.example.android.toorguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ArrayList<ToorList> place2 = new ArrayList<ToorList>();
        place2.add(new ToorList(getString(R.string.indian), getString(R.string.st), R.drawable.indiancoffe));
        place2.add(new ToorList(getString(R.string.market), getString(R.string.sh), R.drawable.shastri));
        place2.add(new ToorList(getString(R.string.swagat), getString(R.string.sl), R.drawable.swagat));
        place2.add(new ToorList(getString(R.string.gasto), getString(R.string.sn), R.drawable.gasto));
        place2.add(new ToorList(getString(R.string.ll), getString(R.string.bth), R.drawable.raju));
        place2.add(new ToorList(getString(R.string.night), getString(R.string.punjab), R.drawable.night));
        ToorAdapter test7 = new ToorAdapter(this, place2);
        ListView club = (ListView) findViewById(R.id.activity_food);
        club.setAdapter(test7);
    }
}
