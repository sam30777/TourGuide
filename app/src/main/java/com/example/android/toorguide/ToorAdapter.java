package com.example.android.toorguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Santosh on 06-02-2017.
 */

public class ToorAdapter extends ArrayAdapter<ToorList> {
    public ToorAdapter(Activity context, ArrayList<ToorList> place) {
        super(context, 0, place);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View placesView = convertView;
        if (placesView == null) {
            placesView = LayoutInflater.from(getContext()).inflate(R.layout.places_list, parent, false);

        }
        ToorList currentPlace = getItem(position);
        TextView place1 = (TextView) placesView.findViewById(R.id.description1);
        place1.setText(currentPlace.getPlaceName());
        TextView place2 = (TextView) placesView.findViewById(R.id.description2);
        place2.setText(currentPlace.getPlaceDescription());
        ImageView img = (ImageView) placesView.findViewById(R.id.malls);
        img.setImageResource(currentPlace.getResourceId());
        return placesView;
    }
}
