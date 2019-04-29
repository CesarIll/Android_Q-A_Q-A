package com.android_q_a_q_a.proyecto.model;

public class Libro {
    private String titulo;
    private String autor;
    private int foto;

    public Libro(String titulo, String autor, int foto) {
        this.titulo = titulo;
        this.autor = autor;
        this.foto = foto;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getFoto() {
        return foto;
    }
}
