package com.example.imageworktest.scrolzoom;

import android.view.MotionEvent;
import android.widget.ImageView;

class Util {
    static boolean hasDrawable(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    static int getPointerIndex(int action) {
        return (action & MotionEvent.ACTION_POINTER_INDEX_MASK) >> MotionEvent.ACTION_POINTER_INDEX_SHIFT;
    }
}
