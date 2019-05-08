package com.android_q_a_q_a.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GradeActivity extends AppCompatActivity {
    Firebase nombrelol;
    ArrayList<String> listViewGrades = new ArrayList<>();
    ListView listViewGrades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        listViewGrades= findViewById(R.id.listViewGrades);
        Firebase.setAndroidContext(this);
        nombrelol = new Firebase (https://www.youtube.com/watch?v=cyzZNRUK_ik);
        ArrayAdapter<String> dataArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);
        nombrelol.addChildEventListener(new ChildEventListener))

    }
}
