package com.android_q_a_q_a.proyecto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerView_Config {

    private Context mContext;
    private NotesAdapter mNotesAdapter;


    public void setConfig (RecyclerView recyclerView,Context context,List<Notes> notes, List <String> keys ){
        mContext = context;
        mNotesAdapter = new NotesAdapter(notes ,keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(mNotesAdapter);
    }

    class NotesItemView  extends RecyclerView.ViewHolder{
        private TextView mnota1;
        private TextView mnota2;
        private TextView mnota3;
        private TextView mnotafinal;
        private TextView mmateria;


        private String key;

        public NotesItemView(ViewGroup parent){
            super(LayoutInflater.from(mContext).inflate(R.layout.grade_item, parent,false));

            mnota1 = (TextView) itemView.findViewById(R.id.nota1);
            mnota2 = (TextView) itemView.findViewById(R.id.nota2);
            mnota3 = (TextView) itemView.findViewById(R.id.nota3);
            mnotafinal = (TextView) itemView.findViewById(R.id.notaFinal);
            mmateria = (TextView) itemView.findViewById(R.id.materia);

        }

        public void  bind(Notes note , String key){
            mnota1.setText(note.getPrimero());
            mnota2.setText(note.getSegundo());
            mnota3.setText(note.getTercero());
            mnotafinal.setText(note.getResultado());
            mmateria.setText(note.getN_materia());
            this.key = key;

        }


    }

    class NotesAdapter extends RecyclerView.Adapter<NotesItemView> {
        private List <Notes> mNotesList;
        private List <String> mKeys;

        public NotesAdapter(List<Notes> mNotesList, List<String> mKeys) {
            this.mNotesList = mNotesList;
            this.mKeys = mKeys;
        }

        @NonNull
        @Override
        public NotesItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new NotesItemView(parent);
        }

        @Override
        public void onBindViewHolder(@NonNull NotesItemView holder, int position) {
            holder.bind(mNotesList.get(position),mKeys.get(position));
        }

        @Override
        public int getItemCount() {
            return mNotesList.size();
        }
    }

}

