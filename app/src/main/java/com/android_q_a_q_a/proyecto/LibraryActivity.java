package com.android_q_a_q_a.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android_q_a_q_a.proyecto.Adapters.LibraryAdapter;
import com.android_q_a_q_a.proyecto.model.Libro;

import java.util.LinkedList;
import java.util.List;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewMenu);

        List<Libro> libroList = new LinkedList<>();
        libroList.add(new Libro("Cien años de soledad", "Gabriel García Márquez", R.drawable.cien_anios_de_soledad));
        libroList.add(new Libro("El principito", "Antoine de Saint-Exupery", R.drawable.el_principito));
        libroList.add(new Libro("Estudio en escarlata", "Arthur Conan Doyle", R.drawable.estudio_en_escarlata));
        libroList.add(new Libro("Maus", "Art Spiegelman", R.drawable.maus));
        libroList.add(new Libro("El ingenioso hidalgo don Quijote de la Mancha", "Miguel de Cervantes", R.drawable.el_ingenioso_hidalgo_don_quijote_de_la_mancha));
        libroList.add(new Libro("Segunda parte del ingenioso caballero don Quijote de la Mancha", "Miguel de Cervantes", R.drawable.segunda_parte_del_ingenioso_caballero_don_quijote_de_la_mancha));
        libroList.add(new Libro("Divina comedia", "Dante Alighieri", R.drawable.divina_comedia));
        libroList.add(new Libro("Cien años de soledad", "Gabriel García Márquez", R.drawable.cien_anios_de_soledad));
        libroList.add(new Libro("El principito", "Antoine de Saint-Exupery", R.drawable.el_principito));
        libroList.add(new Libro("Estudio en escarlata", "Arthur Conan Doyle", R.drawable.estudio_en_escarlata));
        libroList.add(new Libro("Maus", "Art Spiegelman", R.drawable.maus));
        libroList.add(new Libro("El ingenioso hidalgo don Quijote de la Mancha", "Miguel de Cervantes", R.drawable.el_ingenioso_hidalgo_don_quijote_de_la_mancha));
        libroList.add(new Libro("Segunda parte del ingenioso caballero don Quijote de la Mancha", "Miguel de Cervantes", R.drawable.segunda_parte_del_ingenioso_caballero_don_quijote_de_la_mancha));
        libroList.add(new Libro("Divina comedia", "Dante Alighieri", R.drawable.divina_comedia));
        libroList.add(new Libro("Cien años de soledad", "Gabriel García Márquez", R.drawable.cien_anios_de_soledad));
        libroList.add(new Libro("El principito", "Antoine de Saint-Exupery", R.drawable.el_principito));
        libroList.add(new Libro("Estudio en escarlata", "Arthur Conan Doyle", R.drawable.estudio_en_escarlata));
        libroList.add(new Libro("Maus", "Art Spiegelman", R.drawable.maus));
        libroList.add(new Libro("El ingenioso hidalgo don Quijote de la Mancha", "Miguel de Cervantes", R.drawable.el_ingenioso_hidalgo_don_quijote_de_la_mancha));
        libroList.add(new Libro("Segunda parte del ingenioso caballero don Quijote de la Mancha", "Miguel de Cervantes", R.drawable.segunda_parte_del_ingenioso_caballero_don_quijote_de_la_mancha));
        libroList.add(new Libro("Divina comedia", "Dante Alighieri", R.drawable.divina_comedia));

        LibraryAdapter adapter = new LibraryAdapter(this, libroList);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


}
