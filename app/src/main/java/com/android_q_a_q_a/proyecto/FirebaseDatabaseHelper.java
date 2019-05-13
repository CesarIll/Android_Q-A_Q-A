package com.android_q_a_q_a.proyecto;


import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FirebaseDatabaseHelper {

    private FirebaseDatabase mDataBase;
    private DatabaseReference mReferenceNotes;

    private List<Notes> notes = new ArrayList<>();


    public interface  DataStatus {
        void DataIsLoaded(List<Notes> notes, List<String> keys);

        void DataIsInserted();

        void DataIsUpdated();

        void DataIsDeleted();
    }


    public FirebaseDatabaseHelper() {
        mDataBase = FirebaseDatabase.getInstance();
        mReferenceNotes= mDataBase.getReference("notas");
    }

    public void readNotes(final DataStatus dataStatus) {
        mReferenceNotes.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                notes.clear();
                List<String> keys = new ArrayList<>();
                for (DataSnapshot keyNode : dataSnapshot.getChildren()) {
                    keys.add(keyNode.getKey());
                    Notes note = keyNode.getValue(Notes.class);
                    notes.add(note);

                }
                dataStatus.DataIsLoaded(notes, keys);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}



