package com.example.android.toorguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Clubs extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        final ArrayList<ToorList> place1 = new ArrayList<ToorList>();
        place1.add(new ToorList(getString(R.string.Kitty), getString(R.string.park), R.drawable.kittysu));
        place1.add(new ToorList(getString(R.string.para), getString(R.string.centra), R.drawable.para));
        place1.add(new ToorList(getString(R.string.downing), getString(R.string.industrial), R.drawable.downingstreet));
        place1.add(new ToorList(getString(R.string.score), getString(R.string.sec), R.drawable.score));
        place1.add(new ToorList(getString(R.string.Tao), getString(R.string.tao), R.drawable.tao));
        place1.add(new ToorList(getString(R.string.buzz), getString(R.string.sco), R.drawable.buzz));
        place1.add(new ToorList(getString(R.string.street), getString(R.string.indus), R.drawable.downingstreet));
        ToorAdapter test7 = new ToorAdapter(this, place1);
        ListView club = (ListView) findViewById(R.id.clubs);
        club.setAdapter(test7);
    }
}
