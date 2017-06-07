package com.earthquake.igor.earthquake;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.TimeUtils;
import android.util.Log;
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
import java.util.TimeZone;
import java.util.regex.Pattern;

/**
 * Created by igor on 02/06/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private Date dateObj = new Date();
    private DateFormat dateFormat = new SimpleDateFormat().getDateInstance();

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

        splitPlaceString(currentEarthquake, convertView);

        dateObj.setTime(currentEarthquake.getmDate());

        TextView date = (TextView)convertView.findViewById(R.id.date);
        date.setText(dateFormat.format(dateObj));

        TextView time = (TextView)convertView.findViewById(R.id.time);
        time.setText(formatTime(dateObj));
        return convertView;
    }

    private void splitPlaceString(Earthquake currentEarthquake, View convertView){
        String str = currentEarthquake.getmLocation();
        Log.e(Earthquake.class.getSimpleName(), "STR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!: " + str);

        if (str.contains("of")) {
            // Split it.
            String[] parts = str.split("of ");

            TextView proximity = (TextView)convertView.findViewById(R.id.proximity);
            proximity.setText(parts[0] + " of");

            TextView location = (TextView)convertView.findViewById(R.id.location);
            location.setText(parts[1]);
        } else {
            TextView proximity = (TextView)convertView.findViewById(R.id.proximity);
            proximity.setText("Right in");

            TextView location = (TextView)convertView.findViewById(R.id.location);
            location.setText(str);
        }
    }

    private String formatTime(Date dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

//        private String formatDate(Date dateObject){
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, YYYY");
//        return dateFormat.format(dateObject);
//    }

}
