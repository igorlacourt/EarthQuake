package com.earthquake.igor.earthquake;

import android.util.Log;
import android.widget.ArrayAdapter;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by igor on 06/06/2017.
 */

public class QueryUtils {

    private QueryUtils(){}

        final static String JASON_SIMPLE_RESULT = "{  \n" +
                "   \"type\":\"FeatureCollection\",\n" +
                "   \"metadata\":{  \n" +
                "      \"generated\":1496779795000,\n" +
                "      \"url\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmag=5&starttime=2017-06-01&endtime=2017-06-06&limit=10\",\n" +
                "      \"title\":\"USGS Earthquakes\",\n" +
                "      \"status\":200,\n" +
                "      \"api\":\"1.5.7\",\n" +
                "      \"limit\":10,\n" +
                "      \"offset\":1,\n" +
                "      \"count\":10\n" +
                "   },\n" +
                "   \"features\":[  \n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":5.6,\n" +
                "            \"place\":\"39km E of Papayal, Peru\",\n" +
                "            \"time\":1496662451310,\n" +
                "            \"updated\":1496773132040,\n" +
                "            \"tz\":-300,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009kr6\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009kr6&format=geojson\",\n" +
                "            \"felt\":47,\n" +
                "            \"cdi\":5.2,\n" +
                "            \"mmi\":4.29,\n" +
                "            \"alert\":\"green\",\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":0,\n" +
                "            \"sig\":507,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009kr6\",\n" +
                "            \"ids\":\",us20009kr6,\",\n" +
                "            \"sources\":\",us,\",\n" +
                "            \"types\":\",dyfi,geoserve,losspager,moment-tensor,origin,phase-data,shakemap,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":0.636,\n" +
                "            \"rms\":1,\n" +
                "            \"gap\":65,\n" +
                "            \"magType\":\"mww\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 5.6 - 39km E of Papayal, Peru\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               -80.3835,\n" +
                "               -4.1044,\n" +
                "               50.81\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009kr6\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":5.2,\n" +
                "            \"place\":\"95km ENE of Iwo Jima, Japan\",\n" +
                "            \"time\":1496601972780,\n" +
                "            \"updated\":1496603152040,\n" +
                "            \"tz\":540,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009kmz\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009kmz&format=geojson\",\n" +
                "            \"felt\":null,\n" +
                "            \"cdi\":null,\n" +
                "            \"mmi\":null,\n" +
                "            \"alert\":null,\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":0,\n" +
                "            \"sig\":416,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009kmz\",\n" +
                "            \"ids\":\",us20009kmz,\",\n" +
                "            \"sources\":\",us,\",\n" +
                "            \"types\":\",geoserve,origin,phase-data,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":2.091,\n" +
                "            \"rms\":1.51,\n" +
                "            \"gap\":111,\n" +
                "            \"magType\":\"mb\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 5.2 - 95km ENE of Iwo Jima, Japan\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               142.2528,\n" +
                "               24.9968,\n" +
                "               32.13\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009kmz\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":5.1,\n" +
                "            \"place\":\"139km E of Neiafu, Tonga\",\n" +
                "            \"time\":1496535653090,\n" +
                "            \"updated\":1496537138040,\n" +
                "            \"tz\":-720,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009kjz\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009kjz&format=geojson\",\n" +
                "            \"felt\":null,\n" +
                "            \"cdi\":null,\n" +
                "            \"mmi\":null,\n" +
                "            \"alert\":null,\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":0,\n" +
                "            \"sig\":400,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009kjz\",\n" +
                "            \"ids\":\",us20009kjz,\",\n" +
                "            \"sources\":\",us,\",\n" +
                "            \"types\":\",geoserve,origin,phase-data,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":2.617,\n" +
                "            \"rms\":1.7,\n" +
                "            \"gap\":81,\n" +
                "            \"magType\":\"mb\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 5.1 - 139km E of Neiafu, Tonga\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               -172.6667,\n" +
                "               -18.72,\n" +
                "               10\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009kjz\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":5,\n" +
                "            \"place\":\"73km NNE of Calama, Chile\",\n" +
                "            \"time\":1496528504320,\n" +
                "            \"updated\":1496771186040,\n" +
                "            \"tz\":-240,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009kja\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009kja&format=geojson\",\n" +
                "            \"felt\":null,\n" +
                "            \"cdi\":null,\n" +
                "            \"mmi\":null,\n" +
                "            \"alert\":null,\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":0,\n" +
                "            \"sig\":385,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009kja\",\n" +
                "            \"ids\":\",us20009kja,\",\n" +
                "            \"sources\":\",us,\",\n" +
                "            \"types\":\",geoserve,moment-tensor,origin,phase-data,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":0.611,\n" +
                "            \"rms\":1.48,\n" +
                "            \"gap\":25,\n" +
                "            \"magType\":\"mwr\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 5.0 - 73km NNE of Calama, Chile\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               -68.5915,\n" +
                "               -21.8886,\n" +
                "               96.78\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009kja\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":6,\n" +
                "            \"place\":\"Balleny Islands region\",\n" +
                "            \"time\":1496517453820,\n" +
                "            \"updated\":1496769256040,\n" +
                "            \"tz\":600,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009kit\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009kit&format=geojson\",\n" +
                "            \"felt\":null,\n" +
                "            \"cdi\":null,\n" +
                "            \"mmi\":0,\n" +
                "            \"alert\":\"green\",\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":0,\n" +
                "            \"sig\":554,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009kit\",\n" +
                "            \"ids\":\",us20009kit,\",\n" +
                "            \"sources\":\",us,\",\n" +
                "            \"types\":\",geoserve,losspager,moment-tensor,origin,phase-data,shakemap,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":8.284,\n" +
                "            \"rms\":0.92,\n" +
                "            \"gap\":39,\n" +
                "            \"magType\":\"mww\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 6.0 - Balleny Islands region\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               155.8273,\n" +
                "               -62.5965,\n" +
                "               10\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009kit\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":5.1,\n" +
                "            \"place\":\"84km ENE of Severo-Kuril'sk, Russia\",\n" +
                "            \"time\":1496490443960,\n" +
                "            \"updated\":1496491663918,\n" +
                "            \"tz\":600,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009khw\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009khw&format=geojson\",\n" +
                "            \"felt\":1,\n" +
                "            \"cdi\":2.7,\n" +
                "            \"mmi\":null,\n" +
                "            \"alert\":null,\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":0,\n" +
                "            \"sig\":400,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009khw\",\n" +
                "            \"ids\":\",us20009khw,\",\n" +
                "            \"sources\":\",us,\",\n" +
                "            \"types\":\",dyfi,geoserve,origin,phase-data,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":2.242,\n" +
                "            \"rms\":0.84,\n" +
                "            \"gap\":50,\n" +
                "            \"magType\":\"mww\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 5.1 - 84km ENE of Severo-Kuril'sk, Russia\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               157.2747,\n" +
                "               50.885,\n" +
                "               49.04\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009khw\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":5.9,\n" +
                "            \"place\":\"90km NW of Madang, Papua New Guinea\",\n" +
                "            \"time\":1496447297970,\n" +
                "            \"updated\":1496577042635,\n" +
                "            \"tz\":600,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009jdx\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009jdx&format=geojson\",\n" +
                "            \"felt\":10,\n" +
                "            \"cdi\":5.8,\n" +
                "            \"mmi\":3.82,\n" +
                "            \"alert\":\"green\",\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":1,\n" +
                "            \"sig\":541,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009jdx\",\n" +
                "            \"ids\":\",us20009jdx,\",\n" +
                "            \"sources\":\",us,\",\n" +
                "            \"types\":\",dyfi,geoserve,losspager,moment-tensor,origin,phase-data,shakemap,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":9.361,\n" +
                "            \"rms\":0.63,\n" +
                "            \"gap\":13,\n" +
                "            \"magType\":\"mww\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 5.9 - 90km NW of Madang, Papua New Guinea\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               145.1369,\n" +
                "               -4.7399,\n" +
                "               193.51\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009jdx\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":5,\n" +
                "            \"place\":\"188km NW of Attu Station, Alaska\",\n" +
                "            \"time\":1496442757320,\n" +
                "            \"updated\":1496536269040,\n" +
                "            \"tz\":660,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009jd8\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009jd8&format=geojson\",\n" +
                "            \"felt\":null,\n" +
                "            \"cdi\":null,\n" +
                "            \"mmi\":null,\n" +
                "            \"alert\":null,\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":0,\n" +
                "            \"sig\":385,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009jd8\",\n" +
                "            \"ids\":\",us20009jd8,\",\n" +
                "            \"sources\":\",us,\",\n" +
                "            \"types\":\",geoserve,origin,phase-data,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":2.216,\n" +
                "            \"rms\":1,\n" +
                "            \"gap\":93,\n" +
                "            \"magType\":\"mb\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 5.0 - 188km NW of Attu Station, Alaska\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               170.971,\n" +
                "               53.9052,\n" +
                "               10\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009jd8\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":6.8,\n" +
                "            \"place\":\"200km NW of Attu Station, Alaska\",\n" +
                "            \"time\":1496442287920,\n" +
                "            \"updated\":1496532093280,\n" +
                "            \"tz\":660,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009jd6\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009jd6&format=geojson\",\n" +
                "            \"felt\":null,\n" +
                "            \"cdi\":null,\n" +
                "            \"mmi\":4.1,\n" +
                "            \"alert\":\"green\",\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":1,\n" +
                "            \"sig\":711,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009jd6\",\n" +
                "            \"ids\":\",pt17153000,ak16162636,us20009jd6,\",\n" +
                "            \"sources\":\",pt,ak,us,\",\n" +
                "            \"types\":\",geoserve,impact-link,losspager,moment-tensor,origin,phase-data,shakemap,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":2.313,\n" +
                "            \"rms\":0.92,\n" +
                "            \"gap\":12,\n" +
                "            \"magType\":\"mww\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 6.8 - 200km NW of Attu Station, Alaska\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               170.9096,\n" +
                "               54.0291,\n" +
                "               8.19\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009jd6\"\n" +
                "      },\n" +
                "      {  \n" +
                "         \"type\":\"Feature\",\n" +
                "         \"properties\":{  \n" +
                "            \"mag\":5.1,\n" +
                "            \"place\":\"106km ESE of Hirara, Japan\",\n" +
                "            \"time\":1496424391520,\n" +
                "            \"updated\":1496508492040,\n" +
                "            \"tz\":480,\n" +
                "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009jb7\",\n" +
                "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009jb7&format=geojson\",\n" +
                "            \"felt\":null,\n" +
                "            \"cdi\":null,\n" +
                "            \"mmi\":null,\n" +
                "            \"alert\":null,\n" +
                "            \"status\":\"reviewed\",\n" +
                "            \"tsunami\":0,\n" +
                "            \"sig\":400,\n" +
                "            \"net\":\"us\",\n" +
                "            \"code\":\"20009jb7\",\n" +
                "            \"ids\":\",us20009jb7,\",\n" +
                "            \"sources\":\",us,\",\n" +
                "            \"types\":\",geoserve,origin,phase-data,\",\n" +
                "            \"nst\":null,\n" +
                "            \"dmin\":2.921,\n" +
                "            \"rms\":0.93,\n" +
                "            \"gap\":47,\n" +
                "            \"magType\":\"mb\",\n" +
                "            \"type\":\"earthquake\",\n" +
                "            \"title\":\"M 5.1 - 106km ESE of Hirara, Japan\"\n" +
                "         },\n" +
                "         \"geometry\":{  \n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[  \n" +
                "               126.213,\n" +
                "               24.3423,\n" +
                "               32.5\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"us20009jb7\"\n" +
                "      }\n" +
                "   ],\n" +
                "   \"bbox\":[  \n" +
                "      -172.6667,\n" +
                "      -62.5965,\n" +
                "      8.19,\n" +
                "      170.971,\n" +
                "      54.0291,\n" +
                "      193.51\n" +
                "   ]\n" +
                "}";

    public static ArrayList<Earthquake> extractEarthquake(){

        ArrayList<Earthquake> earthquakes;

        try{
            JSONObject jsonObject = new JSONObject(JASON_SIMPLE_RESULT);

            earthquakes = new ArrayList<>();
            String mag, place;
            long time;

            for (int i = 0; i < jsonObject.getJSONArray("features").length(); i++){
                mag = jsonObject.getJSONArray("features").getJSONObject(i).getJSONObject("properties").getString("mag");
                place = jsonObject.getJSONArray("features").getJSONObject(i).getJSONObject("properties").getString("place");;
                time = jsonObject.getJSONArray("features").getJSONObject(i).getJSONObject("properties").getLong("time");

                earthquakes.add(new Earthquake(mag, place, time));

            }

            return earthquakes;

        } catch (JSONException e){
            return null;
        }
    }

}
