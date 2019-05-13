package com.android_q_a_q_a.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScanCodeActivity extends AppCompatActivity  implements ZXingScannerView.ResultHandler {

    ZXingScannerView ScannerView;
    TextView textView;
    CalendarView calendarView;
    String verdad = "SiMarcoAsistencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScannerView = new ZXingScannerView(this);
        setContentView(ScannerView);


    }


    @Override
    public void handleResult(Result result) {

        AssistanceActivity.resultQR.setText(result.getText());
        onBackPressed();
         MarcoAsistencia();
    }

    @Override
    protected void onPause() {

        super.onPause();

        ScannerView.stopCamera();


    }
    @Override

    protected void onResume() {

        super.onResume();
        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }


    public void MarcoAsistencia (){

            Toast toast = new Toast (this);
            LayoutInflater inflater = LayoutInflater.from(this);
            View layout = inflater.inflate(R.layout.check_true,null);
            toast.setView(layout);
            toast.show();


    }


}
