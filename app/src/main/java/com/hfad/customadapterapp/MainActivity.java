package com.hfad.customadapterapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PlayerInfo> pi = new ArrayList<>();
        pi.add(new PlayerInfo("Arne", 23, "dk"));
        pi.add(new PlayerInfo("Bjarne", 34, "de"));
        pi.add(new PlayerInfo("Sven", 43, "dk"));
        pi.add(new PlayerInfo("Bent", 53, "se"));

        PlayerInfoAdapter adapter = new PlayerInfoAdapter(this , pi);
        ListView theView = findViewById(R.id.theView);
        theView.setAdapter(adapter);
    }
}
