package com.android_q_a_q_a.proyecto;

import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    private ImageView imageView;
    private float scale = 1f;
    public ScaleListener(ImageView imageView){
        this.imageView=imageView;
    }
    public boolean onScale (ScaleGestureDetector sgd){
        scale *=sgd.getScaleFactor();
        imageView.setScaleX(scale);
        imageView.setScaleY(scale);
        return true;
    }
}
