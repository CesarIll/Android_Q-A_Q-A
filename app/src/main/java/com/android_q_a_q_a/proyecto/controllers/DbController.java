package com.android_q_a_q_a.proyecto.controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.android_q_a_q_a.proyecto.model.Nota;

import java.util.LinkedList;
import java.util.List;

public class DbController extends SQLiteOpenHelper {

    public DbController(Context context,String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE nota (_id INTEGER PRIMARY KEY AUTOINCREMENT, materia TEXT, docente TEXT, horario TEXT, nota1 TEXT, nota2 TEXT, nota3 TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS nota;");
        onCreate(db);
    }

    public void addNota(String materia, String docente, String horario, String nota1, String nota2, String nota3) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("materia", materia);
            contentValues.put("docente", docente);
            contentValues.put("horario", horario);
            contentValues.put("nota1", nota1);
            contentValues.put("nota2", nota2);
            contentValues.put("nota3", nota3);
            getWritableDatabase().insertOrThrow("nota", null, contentValues);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Nota> showNotas(){
        try {
            List<Nota> notas = new LinkedList<>();
            Cursor cursor = getReadableDatabase().rawQuery("SELECT * FROM nota", null);
            while (cursor.moveToNext()) {
                notas.add(
                        new Nota(
                                cursor.getString(1),
                                cursor.getString(2),
                                cursor.getString(3),
                                cursor.getString(4),
                                cursor.getString(5),
                                cursor.getString(6)
                        )
                );
            }
            cursor.close();
            return notas;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
