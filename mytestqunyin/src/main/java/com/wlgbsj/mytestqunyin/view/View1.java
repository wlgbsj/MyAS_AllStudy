package com.wlgbsj.mytestqunyin.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wlgbsj on 2017/4/6  18:22.
 */

public class View1 extends View {
    public View1(Context context) {
        this(context,null);
    }

    public View1(Context context, AttributeSet attrs) {
        this(context, null,0);
    }

    public View1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasure(widthMeasureSpec), heightMeasure(heightMeasureSpec));
    }

    private int heightMeasure(int heightMeasureSpec) {
        int result =0;
        int mesureMode = MeasureSpec.getMode(heightMeasureSpec);
        int mesureSize =   MeasureSpec.getSize(heightMeasureSpec);
        if(mesureMode == MeasureSpec.EXACTLY){
            result = mesureSize;
            return result;
        }else {
            result = 200;
            if(mesureMode==MeasureSpec.AT_MOST){
                result = Math.min(result,mesureSize);
            }

            return result;
        }

    }

    private int widthMeasure(int widthMeasureSpec) {
        return 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);

        getMeasuredWidth();
        postInvalidate();
        //new Matrix().setTranslate();
        super.onDraw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}
