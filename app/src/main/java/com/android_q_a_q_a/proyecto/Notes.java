package com.android_q_a_q_a.proyecto;

/*public class Nota {
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
*/





public class Notes {
    private String primero;
    private String segundo;
    private String tercero;
    private String resultado;
    private String  n_materia;


    public Notes(String primero, String segundo, String tercero, String resultado, String n_materia) {
        this.primero = primero;
        this.segundo = segundo;
        this.tercero = tercero;
        this.resultado = resultado;
        this.n_materia = n_materia;
    }

    public Notes (){
    }


    public String getPrimero() {
        return primero;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getTercero() {
        return tercero;
    }

    public void setTercero(String tercero) {
        this.tercero = tercero;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getN_materia() {
        return n_materia;
    }

    public void setN_materia(String n_materia) {
        this.n_materia = n_materia;
    }
}
