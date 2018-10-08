package com.example.anshr.earthquake;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthuakejava>{

    public  EarthquakeAdapter(Activity context, ArrayList<Earthuakejava> earthquakes){
        super(context,0,earthquakes);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listpf=convertView;
        if(listpf==null)
        {
        listpf= LayoutInflater.from((getContext())).inflate(R.layout.earthquake_layout,parent,false);
        }
        Earthuakejava currentlist=getItem(position);
        TextView currentquake=listpf.findViewById(R.id.magnitude);
        currentquake.setText(currentlist.getMag());
        currentquake=listpf.findViewById(R.id.place);
        currentquake.setText(currentlist.getPlace());
        currentquake=listpf.findViewById(R.id.date);
        currentquake.setText(currentlist.getDate());
        return listpf;
    }
}
