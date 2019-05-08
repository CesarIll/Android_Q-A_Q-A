package com.android_q_a_q_a.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class GradeActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
    }

    public void escribirNotas(View view){
        EditText nota = findViewById();
        EditText estudiante = findViewById();
        DatabaseReference TeacherRef = database.getReference("notas/"+estudiante);
        TeacherRef.setValue(nota);
    }
}
