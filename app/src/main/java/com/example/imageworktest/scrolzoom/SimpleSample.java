package com.example.imageworktest.scrolzoom;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.imageworktest.R;

public class SimpleSample extends AppCompatActivity {

    private PhotoView mPhotoView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_sample);

        mPhotoView = findViewById(R.id.iv_photo);

        Drawable bitmap = ContextCompat.getDrawable(this, R.drawable.karta3);
        mPhotoView.setImageDrawable(bitmap);
        mPhotoView.setOnSingleFlingListener(new SingleFlingListener());
    }

    private class SingleFlingListener implements OnSingleFlingListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
            return true;
        }
    }
}
