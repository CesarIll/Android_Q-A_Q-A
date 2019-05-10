package com.android_q_a_q_a.proyecto.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_q_a_q_a.proyecto.R;
import com.android_q_a_q_a.proyecto.model.Nota;

import java.util.List;

public class GradeAdapter extends RecyclerView.Adapter<GradeAdapter.GradeViewHolder> {

    private Context context;
    private List<Nota> notas;
    private LayoutInflater inflater;

    public GradeAdapter(Context context, List<Nota> notas) {
        this.context = context;
        this.notas = notas;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public GradeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = this.inflater.inflate(R.layout.grade_item, null);
        return new GradeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GradeViewHolder gradeViewHolder, int i) {
        gradeViewHolder.textView.setText(this.notas.get(i).getMateria());
        gradeViewHolder.textView1.setText(this.notas.get(i).getDocente());
        gradeViewHolder.textView2.setText(this.notas.get(i).getHorario());
        gradeViewHolder.textView3.setText(this.notas.get(i).getNota1());
        gradeViewHolder.textView4.setText(this.notas.get(i).getNota2());
        gradeViewHolder.textView5.setText(this.notas.get(i).getNota3());
        gradeViewHolder.textView6.setText(this.notas.get(i).getNotaFinal());
    }

    @Override
    public int getItemCount() {
        return this.notas.size();
    }

    public class GradeViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        TextView textView1;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;

        public GradeViewHolder(View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.materia);
            this.textView1 = itemView.findViewById(R.id.docente);
            this.textView2 = itemView.findViewById(R.id.horario);
            this.textView3 = itemView.findViewById(R.id.nota1);
            this.textView4 = itemView.findViewById(R.id.nota2);
            this.textView5 = itemView.findViewById(R.id.nota3);
            this.textView6 = itemView.findViewById(R.id.notaFinal);
        }
    }

    public void setList(List<Nota> notas) {
        this.notas = notas;
        notifyDataSetChanged();
    }
}
