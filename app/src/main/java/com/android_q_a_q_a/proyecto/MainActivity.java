package com.android_q_a_q_a.proyecto;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.SharedElementCallback;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;
//menu
import android.support.v7.widget.CardView;
import android.widget.GridLayout;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    // Create a VideoView variable, a MediaPlayer variable, and an int to hold the current
    // video position.
    private VideoView videoBG;

    MediaPlayer mMediaPlayer;

    int mCurrentVideoPosition;

    Button Login, LoginAsGuest;

    Intent LoginIntent, LoginAsGuestIntent;

    //Objeto GridLayout = Menu

    GridLayout menuGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hook up the VideoView to our UI.
        videoBG = (VideoView) findViewById(R.id.videoView);

        // Build your video Uri
        Uri uri = Uri.parse("android.resource://" // First start with this,
                + getPackageName() // then retrieve your package name,
                + "/" // add a slash,
                + R.raw.upb_campus); // and then finally add your video resource. Make sure it is stored
        // in the raw folder.

        // Set the new Uri to our VideoView
        videoBG.setVideoURI(uri);
        // Start the VideoView
        videoBG.start();

        // Set an OnPreparedListener for our VideoView. For more information about VideoViews,
        // check out the Android Docs: https://developer.android.com/reference/android/widget/VideoView.html
        videoBG.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mMediaPlayer = mediaPlayer;
                // We want our video to play over and over so we set looping to true.
                mMediaPlayer.setLooping(true);
                // We then seek to the current posistion if it has been set and play the video.
                if (mCurrentVideoPosition != 0) {
                    mMediaPlayer.seekTo(mCurrentVideoPosition);
                    mMediaPlayer.start();
                                              }
                                          }
                                      }
        );



        //creando usuarios
        final String cristian = "46284";
        final String cesar = "44925";
        final String sergio = "46125";
        final String fernanda = "46025";
        final String password = "pass123";




        Login = findViewById(R.id.btLogInButton);
        LoginAsGuest = findViewById(R.id.btLogInGuestButton);



        Login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         String codigo = ((EditText)findViewById(R.id.txtcodigo)).getText().toString();

                                         String password = ((EditText)findViewById(R.id.txtpassword)).getText().toString();

                                            if(codigo.equals(cristian)|| codigo.equals(fernanda)||codigo.equals(cesar)||codigo.equals(sergio)  && password.equals(password) ){


                                                LoginIntent = new Intent(MainActivity.this, MenuActivity.class);
                                                startActivity(LoginIntent);
                                            }else{
                                                Toast.makeText(getApplicationContext()," Usuario Incorrecto ",Toast.LENGTH_SHORT).show();
                                            }



                                         /*
                                         LoginIntent = new Intent(MainActivity.this, MenuActivity.class);
                                         startActivity(LoginIntent);
                                     */
                                     }
                                 }
        );
        LoginAsGuest.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {

                                         LoginAsGuestIntent = new Intent(MainActivity.this, Menu_AsGuest_Activity.class);
                                         startActivity(LoginAsGuestIntent);
                                     }
                                 }
        );


    }

    @Override
    protected void onPause() {
        super.onPause();
        // Capture the current video position and pause the video.
        mCurrentVideoPosition = mMediaPlayer.getCurrentPosition();
        videoBG.pause();
    }
    @Override
    protected void onResume() {
        super.onResume();
        // Restart the video when resuming the Activity
        videoBG.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // When the Activity is destroyed, release our MediaPlayer and set it to null.
        mMediaPlayer.release();
        mMediaPlayer = null;
    }



    
}