package com.example.anshr.earthquake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
         ArrayList<Earthuakejava> earthquakes =QueryUtils.extractEarthquakes();
        EarthquakeAdapter itemadapter=new EarthquakeAdapter(this,earthquakes);
        ListView earthquakeListView =  findViewById(R.id.list);
        earthquakeListView.setAdapter(itemadapter);

    }
}
