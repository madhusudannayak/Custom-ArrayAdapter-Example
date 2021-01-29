package com.example.customarrayadapterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Number> number = new ArrayList<Number>();

        number.add(new Number("One",1,R.drawable.one));
        number.add(new Number("Two",2,R.drawable.two));
        number.add(new Number("Three",3,R.drawable.three));
        number.add(new Number("Four",4,R.drawable.four));
        number.add(new Number("Five",5,R.drawable.five));
        number.add(new Number("Six",6,R.drawable.six));
        number.add(new Number("Seven",7,R.drawable.seven));
        number.add(new Number("Eight",8,R.drawable.eight));
        number.add(new Number("Nine",9,R.drawable.nine));
        number.add(new Number("Ten",10,R.drawable.ten));

        NumberAdapter numberAdapter = new NumberAdapter(this,number);

        ListView listView= findViewById(R.id.listview);
        listView.setAdapter(numberAdapter);
    }
}