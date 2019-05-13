package com.android_q_a_q_a.proyecto;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import uk.co.senab.photoview.PhotoViewAttacher;

public class ParkActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonone = findViewById(R.id.parkOne);
    Button buttontwo = findViewById(R.id.parkTwo);
    Button buttonthree = findViewById(R.id.parkThree);
    Button buttonfour = findViewById(R.id.parkFour);
    Button buttonfive = findViewById(R.id.parkFive);
    Button buttonsix = findViewById(R.id.parkSix);
    Button buttonseven = findViewById(R.id.parkSeven);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);

        buttonone.setOnClickListener(this);
        buttontwo.setOnClickListener(this);
        buttonthree.setOnClickListener(this);
        buttonfour.setOnClickListener(this);
        buttonfive.setOnClickListener(this);
        buttonsix.setOnClickListener(this);
        buttonseven.setOnClickListener(this);
    }
@Override
    public void onClick (View view){
        switch (view.getId()){
            case R.id.parkOne:
              CharSequence cs =  buttonone.getText();
              Integer number1 = Integer.parseInt(cs.toString());
              if (number1 <0){
                  number1--;
                  Toast.makeText(this, "Espacio ocupado", Toast.LENGTH_SHORT).show();
                  if (number1==0){
                      Toast.makeText(this, "¡Ocupaste el último espacio!", Toast.LENGTH_SHORT).show();
                      buttonone.setBackgroundResource(R.drawable.fullpark);
                  }
                  buttonone.setEnabled(false);
                  buttontwo.setEnabled(false);
                  buttonthree.setEnabled(false);
                  buttonfour.setEnabled(false);
                  buttonfive.setEnabled(false);
                  buttonsix.setEnabled(false);
                  buttonseven.setEnabled(false);
              } else {
                  Toast.makeText(this, "Todos los parqueos aquí están ocupados", Toast.LENGTH_SHORT).show();
              }
              break;
        }

    }
}