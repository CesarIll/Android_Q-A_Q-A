package com.android_q_a_q_a.proyecto;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;
public class ParkActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    ImageView mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
        mapa = findViewById(R.id.mapa);
        mapa.setImageResource(R.drawable.upblogo);
    }

    public void mostrarPopup (android.view.View v){
        PopupMenu popup = new PopupMenu(this , v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popupmenu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
               mapa.setImageResource(R.drawable.mapacampus);
                return true;
            case R.id.item2:
                mapa.setImageResource(R.drawable.mapacbba);
                return true;
            case R.id.item3:
                Toast.makeText(this, "¡Estamos trabajando en el diseño de Posgrado-La Paz, gracias por tu paciencia!", Toast.LENGTH_LONG).show();
                return true;
            default:
                return false;
        }
    }
}
