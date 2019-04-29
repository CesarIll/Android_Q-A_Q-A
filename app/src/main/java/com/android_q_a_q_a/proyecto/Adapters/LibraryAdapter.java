package com.android_q_a_q_a.proyecto.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_q_a_q_a.proyecto.LibraryActivity;
import com.android_q_a_q_a.proyecto.R;
import com.android_q_a_q_a.proyecto.model.Libro;

import java.util.List;

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.LibraryViewHolder> {

    private Context context;
    private List<Libro> libroList;
    private LayoutInflater inflater;

    public LibraryAdapter (Context context, List<Libro> libroList) {
        this.context = context;
        this.libroList = libroList;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public LibraryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = this.inflater.inflate(R.layout.libro_item, null);
        return new LibraryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LibraryViewHolder libraryViewHolder, int position) {
        libraryViewHolder.imageView.setImageResource(this.libroList.get(position).getFoto());
        libraryViewHolder.textView1.setText(this.libroList.get(position).getTitulo());
        libraryViewHolder.textView2.setText(this.libroList.get(position).getAutor());
    }

    @Override
    public int getItemCount() {
        return this.libroList.size();
    }

    public class LibraryViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView1;
        TextView textView2;

        public LibraryViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.textView1 = itemView.findViewById(R.id.textView1);
            this.textView2 = itemView.findViewById(R.id.textView2);
        }
    }
}
