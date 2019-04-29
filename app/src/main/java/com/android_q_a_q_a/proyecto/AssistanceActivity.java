package com.android_q_a_q_a.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AssistanceActivity extends AppCompatActivity {

    public static TextView resultQR ;
    Button scan_Btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistance);



        resultQR = (TextView) findViewById(R.id.resultadoQR);

        scan_Btn = (Button) findViewById(R.id.btn_QR);
        scan_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ScanCodeActivity.class));

            }
        });
    }
}
