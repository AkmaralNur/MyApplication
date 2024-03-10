package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    public MyView(Context context){
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(3);
        int step = 50;
        int diagonalLength = (int) Math.sqrt(Math.pow(getWidth(), 3) + Math.pow(getHeight(), 3));

        int i = 0;
        while (i <= diagonalLength) {
            canvas.drawLine(getWidth(), i, getWidth() - i, 0, paint);
            i += step;
        }
    }
}
