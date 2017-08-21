package com.example.android.toorguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Couples extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couples);
        ArrayList<ToorList> place4 = new ArrayList<ToorList>();
        place4.add(new ToorList(getString(R.string.Fragrence), getString(R.string.sector), R.drawable.fragrance));
        place4.add(new ToorList(getString(R.string.lazer), getString(R.string.sex), R.drawable.lazer));
        place4.add(new ToorList(getString(R.string.garden), getString(R.string.sw), R.drawable.japanese));
        place4.add(new ToorList(getString(R.string.palm), getString(R.string.swz), R.drawable.palm));
        place4.add(new ToorList(getString(R.string.lake), getString(R.string.sq), R.drawable.newlake));
        place4.add(new ToorList(getString(R.string.kunj), getString(R.string.sa), R.drawable.santikunj));
        ToorAdapter test7 = new ToorAdapter(this, place4);
        ListView club = (ListView) findViewById(R.id.activity_couples);
        club.setAdapter(test7);
    }
}
