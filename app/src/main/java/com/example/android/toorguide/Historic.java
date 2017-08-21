package com.example.android.toorguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Historic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historic);
        ArrayList<ToorList> place = new ArrayList<ToorList>();
        place.add(new ToorList(getString(R.string.rock), getString(R.string.ol), R.drawable.rockgarden));
        place.add(new ToorList(getString(R.string.lak), getString(R.string.kk), R.drawable.sukhnalake));
        place.add(new ToorList(getString(R.string.lcar), getString(R.string.jkk), R.drawable.lecarbusar));
        place.add(new ToorList(getString(R.string.rose), getString(R.string.iooo), R.drawable.rosegarden));
        place.add(new ToorList(getString(R.string.qwerty), getString(R.string.ppp), R.drawable.nepli));
        place.add(new ToorList(getString(R.string.opnhand), getString(R.string.qwe), R.drawable.openhand));
        place.add(new ToorList(getString(R.string.tpiary), getString(R.string.sdfg), R.drawable.tapuary));
        ToorAdapter test7 = new ToorAdapter(this, place);
        ListView club = (ListView) findViewById(R.id.activity_historic);
        club.setAdapter(test7);
    }
}
