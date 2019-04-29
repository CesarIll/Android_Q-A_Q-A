package com.android_q_a_q_a.proyecto;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    Intent intent;
    GridLayout menuGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //--------------------------------------------------------------
        //Menu OnClick in CardViews

        menuGrid = (GridLayout) findViewById(R.id.menuGrid);
        setSingleEvent(menuGrid);


    }
    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int cardIndex = i;
            cardView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    if (cardIndex == 0) {

                         intent = new Intent(MenuActivity.this, AssistanceActivity.class);
                        intent.putExtra("info", "Accediendo asistencia....." );
                        startActivity(intent);
                    }else if(cardIndex == 1 ){
                        intent = new Intent(MenuActivity.this, ParkActivity.class);
                        intent.putExtra("info", "Accediendo Parqueo....." );
                        startActivity(intent);

                    }else if(cardIndex == 2){
                        intent = new Intent(MenuActivity.this, GradeActivity.class);
                        intent.putExtra("info", "Accediendo A Notas....." );
                        startActivity(intent);
                    }else if (cardIndex == 3){
                        intent = new Intent(MenuActivity.this, LibraryActivity.class);
                        intent.putExtra("info", "Accediendo A Biblioteda....." );
                        startActivity(intent);
                    }
                }
            });
        }
    }

}
