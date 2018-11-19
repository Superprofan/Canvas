package com.superprofan.canvas;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new DrawView(this));
    }
    class DrawView extends View{
        Paint p;
        Matrix matrix;
        RectF rectf;
        Path path;

        public DrawView(Context context){
            super(context);
            p = new Paint();
            p.setStrokeWidth(10);
            p.setStyle(Paint.Style.FILL_AND_STROKE);
            rectf = new RectF(100, 90, 200, 250);
            matrix = new Matrix();
            path = new Path();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawARGB(80, 102, 204, 255);

            //square
            p.setColor(Color.MAGENTA);
            canvas.drawRect(rectf, p);

            //transformed square
            canvas.rotate(30);
            canvas.translate(500, 000);
            p.setColor(Color.GREEN);
            canvas.drawRect(rectf, p);
        }
    }
}
