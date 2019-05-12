package com.android_q_a_q_a.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android_q_a_q_a.proyecto.Adapters.GradeAdapter;
import com.android_q_a_q_a.proyecto.controllers.DbController;
import com.android_q_a_q_a.proyecto.model.Nota;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.LinkedList;
import java.util.List;

public class GradeActivity extends AppCompatActivity {

    DbController controller;
    RecyclerView recyclerView;

    GradeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        recyclerView = findViewById(R.id.listViewGrades);

        List<Nota> notaList = new LinkedList<>();

        notaList.add(new Nota("Matemáticas para ingeniería I","Msc. Ariel Urquidi","B", "0","0" ,"0"));
        notaList.add(new Nota("","","","30", "70", "85"));
        notaList.add(new Nota("Algorítmica I","Alexis Marechal, PhD","", "0","0" ,"0"));
        notaList.add(new Nota("","","", "88", "100", "65"));
        notaList.add(new Nota("","","", "55", "23", "100"));
        notaList.add(new Nota("","","", "34", "90", "89"));
        notaList.add(new Nota("","","", "76", "88", "79"));
        notaList.add(new Nota("","","", "0","0" ,"0"));
        notaList.add(new Nota("","","", "0","0" ,"0"));
        notaList.add(new Nota("","","", "77", "45", "51"));
        notaList.add(new Nota("","","", "0","0" ,"0"));
        notaList.add(new Nota("","","", "66", "55", "78"));
        notaList.add(new Nota("","","", "89", "87", "88"));
        notaList.add(new Nota("","","", "99", "100", "100"));
        notaList.add(new Nota("","","", "0","0" ,"0"));

        controller = new DbController(this, "Notas.db", null, 1);
        adapter = new GradeAdapter(this, notaList);
        //updateList();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void escribirNotas(android.view.View view){
        //EditText nota = findViewById();
        //EditText estudiante = findViewById();
        //DatabaseReference TeacherRef = database.getReference("notas/"+estudiante);
        //TeacherRef.setValue(nota);
    }

    private void updateList() {
        adapter.setList(controller.showNotas());
    }
}
