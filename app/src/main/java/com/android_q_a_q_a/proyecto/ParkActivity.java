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

public class ParkActivity extends AppCompatActivity {
    Button buttonone;
    Button buttontwo;
    Button buttonthree;
    Button buttonfour;
    Button buttonfive;
    Button buttonsix;
    Button buttonseven;
    CharSequence cs1;
    CharSequence cs2;
    CharSequence cs3;
    CharSequence cs4;
    CharSequence cs5;
    CharSequence cs6;
    CharSequence cs7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
        buttonone = findViewById(R.id.parkOne);
        buttontwo = findViewById(R.id.parkTwo);
        buttonthree = findViewById(R.id.parkThree);
        buttonfour = findViewById(R.id.parkFour);
        buttonfive = findViewById(R.id.parkFive);
        buttonsix = findViewById(R.id.parkSix);
        buttonseven = findViewById(R.id.parkSeven);
        buttonone.setText("");
        buttontwo.setText("4");
        buttonthree.setText("1");
        buttonfour.setText("2");
        buttonfive.setText("4");
        buttonsix.setText("2");
        buttonseven.setText("9");
        if (buttonone.getText().equals("")) {
            buttonone.setBackgroundResource(R.drawable.fullpark);
        }
        if (buttontwo.getText().equals("")) {
            buttontwo.setBackgroundResource(R.drawable.fullpark);
        }
        if (buttonthree.getText().equals("")) {
            buttonthree.setBackgroundResource(R.drawable.fullpark);
        }
        if (buttonfour.getText().equals("")) {
            buttonfour.setBackgroundResource(R.drawable.fullpark);
        }
        if (buttonfive.getText().equals("")) {
            buttonfive.setBackgroundResource(R.drawable.fullpark);
        }
        if (buttonsix.getText().equals("")) {
            buttonsix.setBackgroundResource(R.drawable.fullpark);
        }
        if (buttonseven.getText().equals("")) {
            buttonseven.setBackgroundResource(R.drawable.fullpark);
        }
    }

    public void parking(View view) {
        switch (view.getId()) {
            case R.id.parkOne:
                if (buttonone.getText().equals("")) {
                    Toast.makeText(this, "Todos los parqueos aquí están ocupados", Toast.LENGTH_SHORT).show();
                } else {
                    cs1 = buttonone.getText();
                    int number1 = Integer.parseInt(cs1.toString());
                    if (number1 > 0) {
                        number1--;
                        String sNumber = Integer.toString(number1);
                        cs1 = sNumber;
                        buttonone.setText(cs1);
                        Toast.makeText(this, "Espacio ocupado", Toast.LENGTH_SHORT).show();
                        if (number1 == 0) {
                            Toast.makeText(this, "¡Ocupaste el último espacio!", Toast.LENGTH_SHORT).show();
                            buttonone.setBackgroundResource(R.drawable.fullpark);
                            buttonone.setText("");
                        }
                        buttonone.setEnabled(false);
                        buttontwo.setEnabled(false);
                        buttonthree.setEnabled(false);
                        buttonfour.setEnabled(false);
                        buttonfive.setEnabled(false);
                        buttonsix.setEnabled(false);
                        buttonseven.setEnabled(false);
                    }
                }
                break;
            case R.id.parkTwo:
                if (buttontwo.getText().equals("")) {
                    Toast.makeText(this, "Todos los parqueos aquí están ocupados", Toast.LENGTH_SHORT).show();
                } else {
                    cs2 = buttontwo.getText();
                    int number2 = Integer.parseInt(cs2.toString());
                    if (number2 > 0) {
                        number2--;
                        String sNumber = Integer.toString(number2);
                        cs2 = sNumber;
                        buttontwo.setText(cs2);
                        Toast.makeText(this, "Espacio ocupado", Toast.LENGTH_SHORT).show();
                        if (number2 == 0) {
                            Toast.makeText(this, "¡Ocupaste el último espacio!", Toast.LENGTH_SHORT).show();
                            buttontwo.setBackgroundResource(R.drawable.fullpark);
                            buttontwo.setText("");
                        }
                        buttonone.setEnabled(false);
                        buttontwo.setEnabled(false);
                        buttonthree.setEnabled(false);
                        buttonfour.setEnabled(false);
                        buttonfive.setEnabled(false);
                        buttonsix.setEnabled(false);
                        buttonseven.setEnabled(false);
                    }
                }
                break;

            case R.id.parkThree:
                if (buttonthree.getText().equals("")) {
                    Toast.makeText(this, "Todos los parqueos aquí están ocupados", Toast.LENGTH_SHORT).show();
                } else {
                    cs3 = buttonthree.getText();
                    int number3 = Integer.parseInt(cs3.toString());
                    if (number3 > 0) {
                        number3--;
                        String sNumber = Integer.toString(number3);
                        cs3 = sNumber;
                        buttonthree.setText(cs3);
                        Toast.makeText(this, "Espacio ocupado", Toast.LENGTH_SHORT).show();
                        if (number3 == 0) {
                            Toast.makeText(this, "¡Ocupaste el último espacio!", Toast.LENGTH_SHORT).show();
                            buttonthree.setBackgroundResource(R.drawable.fullpark);
                            buttonthree.setText("");
                        }
                        buttonone.setEnabled(false);
                        buttontwo.setEnabled(false);
                        buttonthree.setEnabled(false);
                        buttonfour.setEnabled(false);
                        buttonfive.setEnabled(false);
                        buttonsix.setEnabled(false);
                        buttonseven.setEnabled(false);
                    }
                }
                break;

            case R.id.parkFour:
                if (buttonfour.getText().equals("")) {
                    Toast.makeText(this, "Todos los parqueos aquí están ocupados", Toast.LENGTH_SHORT).show();
                } else {
                    cs4 = buttonfour.getText();
                    int number4 = Integer.parseInt(cs4.toString());
                    if (number4 > 0) {
                        number4--;
                        String sNumber = Integer.toString(number4);
                        cs4 = sNumber;
                        buttonfour.setText(cs4);
                        Toast.makeText(this, "Espacio ocupado", Toast.LENGTH_SHORT).show();
                        if (number4 == 0) {
                            Toast.makeText(this, "¡Ocupaste el último espacio!", Toast.LENGTH_SHORT).show();
                            buttonfour.setBackgroundResource(R.drawable.fullpark);
                            buttonfour.setText("");
                        }
                        buttonone.setEnabled(false);
                        buttontwo.setEnabled(false);
                        buttonthree.setEnabled(false);
                        buttonfour.setEnabled(false);
                        buttonfive.setEnabled(false);
                        buttonsix.setEnabled(false);
                        buttonseven.setEnabled(false);
                    }
                }
                break;

            case R.id.parkFive:
                if (buttonfive.getText().equals("")) {
                    Toast.makeText(this, "Todos los parqueos aquí están ocupados", Toast.LENGTH_SHORT).show();
                } else {
                    cs5 = buttonfive.getText();
                    int number5 = Integer.parseInt(cs5.toString());
                    if (number5 > 0) {
                        number5--;
                        String sNumber = Integer.toString(number5);
                        cs5 = sNumber;
                        buttonfive.setText(cs5);
                        Toast.makeText(this, "Espacio ocupado", Toast.LENGTH_SHORT).show();
                        if (number5 == 0) {
                            Toast.makeText(this, "¡Ocupaste el último espacio!", Toast.LENGTH_SHORT).show();
                            buttonfive.setBackgroundResource(R.drawable.fullpark);
                            buttonfive.setText("");
                        }
                        buttonone.setEnabled(false);
                        buttontwo.setEnabled(false);
                        buttonthree.setEnabled(false);
                        buttonfour.setEnabled(false);
                        buttonfive.setEnabled(false);
                        buttonsix.setEnabled(false);
                        buttonseven.setEnabled(false);
                    }
                }
                break;

            case R.id.parkSix:
                if (buttonsix.getText().equals("")) {
                    Toast.makeText(this, "Todos los parqueos aquí están ocupados", Toast.LENGTH_SHORT).show();
                } else {
                    cs6 = buttonsix.getText();
                    int number6 = Integer.parseInt(cs6.toString());
                    if (number6 > 0) {
                        number6--;
                        String sNumber = Integer.toString(number6);
                        cs6 = sNumber;
                        buttonsix.setText(cs6);
                        Toast.makeText(this, "Espacio ocupado", Toast.LENGTH_SHORT).show();
                        if (number6 == 0) {
                            Toast.makeText(this, "¡Ocupaste el último espacio!", Toast.LENGTH_SHORT).show();
                            buttonsix.setBackgroundResource(R.drawable.fullpark);
                            buttonsix.setText("");
                        }
                        buttonone.setEnabled(false);
                        buttontwo.setEnabled(false);
                        buttonthree.setEnabled(false);
                        buttonfour.setEnabled(false);
                        buttonfive.setEnabled(false);
                        buttonsix.setEnabled(false);
                        buttonseven.setEnabled(false);
                    }
                }
                break;


            case R.id.parkSeven:
                if (buttonseven.getText().equals("")) {
                    Toast.makeText(this, "Todos los parqueos aquí están ocupados", Toast.LENGTH_SHORT).show();
                } else {
                    cs7 = buttonseven.getText();
                    int number7 = Integer.parseInt(cs7.toString());
                    if (number7 > 0) {
                        number7--;
                        String sNumber = Integer.toString(number7);
                        cs7 = sNumber;
                        buttonseven.setText(cs7);
                        Toast.makeText(this, "Espacio ocupado", Toast.LENGTH_SHORT).show();
                        if (number7 == 0) {
                            Toast.makeText(this, "¡Ocupaste el último espacio!", Toast.LENGTH_SHORT).show();
                            buttonseven.setBackgroundResource(R.drawable.fullpark);
                            buttonseven.setText("");
                        }
                        buttonone.setEnabled(false);
                        buttontwo.setEnabled(false);
                        buttonthree.setEnabled(false);
                        buttonfour.setEnabled(false);
                        buttonfive.setEnabled(false);
                        buttonsix.setEnabled(false);
                        buttonseven.setEnabled(false);
                    }
                }
                break;
        }
    }
}
