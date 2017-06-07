package com.earthquake.igor.earthquake;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by igor on 02/06/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private Date dateObj = new Date();
    private DateFormat dateFormat = new SimpleDateFormat().getDateTimeInstance();

    public EarthquakeAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Earthquake> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_listview_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitude = (TextView)convertView.findViewById(R.id.magnitude);
        magnitude.setText(currentEarthquake.getmMagnitude());

        TextView location = (TextView)convertView.findViewById(R.id.location);
        location.setText(currentEarthquake.getmLocation());

        TextView date = (TextView)convertView.findViewById(R.id.date);
        dateObj.setTime(currentEarthquake.getmDate());
        date.setText(dateFormat.format(dateObj));

        return convertView;
    }


}
