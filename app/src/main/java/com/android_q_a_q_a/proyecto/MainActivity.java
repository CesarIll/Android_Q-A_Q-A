package com.android_q_a_q_a.proyecto;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;
//menu
import android.widget.GridLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    // Create a VideoView variable, a MediaPlayer variable, and an int to hold the current
    // video position.

    View view;

    private VideoView videoBG;

    MediaPlayer mMediaPlayer;

    int mCurrentVideoPosition;

    Button login, loginAsGuest;

    Intent loginIntent, loginAsGuestIntent;

    CheckBox checkBox;

    SharedPreferences sharedPreferences;

    //Objeto GridLayout = Menu

    GridLayout menuGrid;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    private String docente;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("DatoCheckbox", MODE_PRIVATE);
        boolean lastCheckBoxValue = sharedPreferences.getBoolean("checkBoxValue", false);
        if (lastCheckBoxValue) {
            loginIntent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(loginIntent);
        }

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


        //Creando usuarios
        final String cristian = "46284";
        final String cesar = "44925";
        final String sergio = "46125";
        final String fernanda = "46025";

        final String thepassword = "pass123";
        final String rachael = "52139";
        final String junior = "52305";


        checkBox = findViewById(R.id.checkBox);
        login = findViewById(R.id.btLogInButton);
        loginAsGuest = findViewById(R.id.btLogInGuestButton);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String codigo = ((EditText) findViewById(R.id.txtcodigo)).getText().toString();

                String password = ((EditText) findViewById(R.id.txtpassword)).getText().toString();


                if (codigo.equals(cristian) || codigo.equals(fernanda) || codigo.equals(cesar) || codigo.equals(sergio)) {
                    if (thepassword.equals(password)) {
                        if (checkBox.isChecked()) {
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putBoolean("checkBoxValue", checkBox.isChecked());
                            editor.apply();
                            editor.commit();
                        }
                        loginIntent = new Intent(MainActivity.this, MenuActivity.class);
                        startActivity(loginIntent);
                    } else {
                        ToastPasswordFail();
                    }
                } else {
                    ToastLoginFail();
                }

            }
        })
        ;
        loginAsGuest.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {

                                                loginAsGuestIntent = new Intent(MainActivity.this, CampusActivity.class);
                                                startActivity(loginAsGuestIntent);
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


    public void ToastLoginFail() {

        Toast toast = new Toast(this);
        LayoutInflater inflater = LayoutInflater.from(this);
        View layout = inflater.inflate(R.layout.login_fail, null);
        toast.setView(layout);
        toast.show();
    }

    public void ToastPasswordFail() {

        Toast toast = new Toast(this);
        LayoutInflater inflater = LayoutInflater.from(this);
        View layout = inflater.inflate(R.layout.password_fail, null);
        toast.setView(layout);
        toast.show();
    }


}