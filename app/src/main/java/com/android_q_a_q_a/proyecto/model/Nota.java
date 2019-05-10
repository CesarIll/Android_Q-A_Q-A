package com.android_q_a_q_a.proyecto.model;

public class Nota {
    private String materia;
    private String docente;
    private String horario;
    private String nota1;
    private String nota2;
    private String nota3;
    private int notaFinal;

    public Nota(String materia, String docente, String horario, String nota1, String nota2, String nota3) {
        this.materia = materia;
        this.docente = docente;
        this.horario = horario;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        if (nota1 != null && nota2 != null && nota3 != null)
            this.notaFinal = ((int) (this.nota1.toCharArray()[0] * 0.3 + this.nota2.toCharArray()[0] * 0.3 + this.nota3.toCharArray()[0] * 0.4));
    }

    public String getMateria() {
        return materia;
    }

    public String getDocente() {
        return docente;
    }

    public String getHorario() {
        return horario;
    }

    public String getNota1() {
        return nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public int getNotaFinal() {
        return notaFinal;
    }
}
