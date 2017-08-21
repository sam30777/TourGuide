package com.example.android.toorguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Malls extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);
        ArrayList<ToorList> place = new ArrayList<ToorList>();
        place.add(new ToorList(getString(R.string.elante), getString(R.string.indu), R.drawable.place1));
        place.add(new ToorList(getString(R.string.shalimar), getString(R.string.sety), R.drawable.shalimar));
        place.add(new ToorList(getString(R.string.pica), getString(R.string.sd), R.drawable.picardly));
        place.add(new ToorList(getString(R.string.ctra), getString(R.string.in), R.drawable.centra));
        place.add(new ToorList(getString(R.string.north), getString(R.string.phase), R.drawable.ncm));
        place.add(new ToorList(getString(R.string.paras), getString(R.string.pkasee), R.drawable.parasmall));
        ToorAdapter test7 = new ToorAdapter(this, place);
        ListView club = (ListView) findViewById(R.id.activity_malls);
        club.setAdapter(test7);
    }
}
