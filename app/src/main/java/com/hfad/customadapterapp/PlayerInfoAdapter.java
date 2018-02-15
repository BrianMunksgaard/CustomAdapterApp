package com.hfad.customadapterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by brianmunksgaard on 15/02/2018.
 */

public class PlayerInfoAdapter extends ArrayAdapter<PlayerInfo> {

    private Context context;

    public  PlayerInfoAdapter(Context context, ArrayList<PlayerInfo> players) {
        super (context,0, players); // The 0 indicates we do not use any built in layouts, but have our own.

        this.context  = context; /*Context context is defined in the PlayerInfoAdapter class as a global variable to save the context for later use.*/
    }

    @Override
    public  View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final PlayerInfo player = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if  (convertView ==  null ) {
            convertView = LayoutInflater.from(context).inflate(R.layout.player_info, parent,false );
        }

        TextView piName = convertView.findViewById(R.id.player_info_name);
        piName.setText(player.getName());

        TextView piAge = convertView.findViewById(R.id.player_info_age);
        piAge.setText(String.valueOf(player.getAge()));

        TextView piCountry = convertView.findViewById(R.id.player_info_country);
        piCountry.setText(player.getCountryCode());

        //Button viewGamesButton = (Button) convertView.findViewById(R.id. viewGamesButton );
        //ImageView image = (ImageView) convertView.findViewById(R.id. image );
        return convertView;
    }
}
