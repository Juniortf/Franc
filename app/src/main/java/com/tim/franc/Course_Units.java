package com.tim.franc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Course_Units extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course__units);
        String[] courses = {

                "Course one  -  networking",
                "course two - DBMS",
                "course three-c++",
                "course four -java",
        };

        ListView jk = (ListView) findViewById(R.id.Francis);
        ListAdapter ListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, courses);
        jk.setAdapter(ListAdapter);
    }
}
