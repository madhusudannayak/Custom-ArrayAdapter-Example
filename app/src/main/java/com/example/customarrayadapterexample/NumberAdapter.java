package com.example.customarrayadapterexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberAdapter extends ArrayAdapter <Number> {

    public NumberAdapter(Activity context, ArrayList<Number> number) {

        super(context, 0, number);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Number currentNumber = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
        nameTextView.setText(currentNumber.getName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
         numberTextView.setText(String.valueOf(currentNumber.getNumber()));

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentNumber.getImageResourceId());

        return listItemView;
    }

}


