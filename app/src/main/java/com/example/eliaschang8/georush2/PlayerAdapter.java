package com.example.eliaschang8.georush2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by eliaschang8 on 4/10/17.
 */

public class PlayerAdapter extends ArrayAdapter<Player> {

    public PlayerAdapter(Context context, List<Player> objects) {
        super(context, 0, objects);
    }

    @Override
    public android.view.View getView(int position, View convertView, ViewGroup parent) {
        //if not given a view, we need to make one
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_player, null);
        }
        //get the item at the position where we are
        Player player = getItem(position);

        //wire up our view
        TextView nameText = (TextView) convertView.findViewById(R.id.text_name);
        TextView powerText = (TextView) convertView.findViewById(R.id.text_score);

        //put the text of the hero into the appropriate views
        nameText.setText(player.getName());
        powerText.setText(""+player.getScore());

        //return the view that you had edited
        return convertView;

    }
}