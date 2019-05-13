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

public class ParkActivity extends AppCompatActivity{
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
    }
    public void parking (View view){

        }

    }
}