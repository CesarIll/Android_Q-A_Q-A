package com.android_q_a_q_a.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GradeActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();

    ArrayList<String> arrayListViewGrades = new ArrayList<>();
    ListView listViewGrades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        listViewGrades= findViewById(R.id.listViewGrades);
        ArrayAdapter<String> dataArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);

    }

    public void escribirNotas(android.view.View view){
        //EditText nota = findViewById();
        //EditText estudiante = findViewById();
       // DatabaseReference TeacherRef = database.getReference("notas/"+estudiante);
        //TeacherRef.setValue(nota);
    }
}
