package com.earthquake.igor.earthquake;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.TimeUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.DecimalFormat;
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
        magnitude.setText(magnitudeFormat(Double.parseDouble(currentEarthquake.getmMagnitude())));

        //Get the circle shape and change it's color
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitude.getBackground();
        magnitudeCircle.setColor(getMagnitudeColor(Double.parseDouble(currentEarthquake.getmMagnitude())));

        //Split string in two parts
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

    public int getMagnitudeColor(double magnitude){

        int intMagFloor = (int)Math.floor(magnitude);

        int colorResId = R.color.magnitude10plus;

        switch (intMagFloor){
            case 0:  colorResId = R.color.magnitude1;
                break;
            case 1: colorResId = R.color.magnitude1;
                break;
            case 2: colorResId = R.color.magnitude3;
                break;
            case 3: colorResId = R.color.magnitude4;
                break;
            case 4: colorResId = R.color.magnitude5;
                break;
            case 5: colorResId = R.color.magnitude6;
                break;
            case 6: colorResId = R.color.magnitude7;
                break;
            case 7: colorResId = R.color.magnitude8;
                break;
            case 9: colorResId = R.color.magnitude9;
                break;
            default: colorResId = R.color.magnitude10plus;
                break;
        }

        //Returns the color integer using the resource ID integer
        return ContextCompat.getColor(getContext(), colorResId);
    }

    private String magnitudeFormat(double magnitude){
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        return decimalFormat.format(magnitude);
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
