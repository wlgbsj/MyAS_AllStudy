package com.imooc.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by wlgbsj on 2017/4/7  17:46.
 */

public class MyView extends ImageView {

    private int LastX;
    private int LastY;
    public MyView(Context context) {
        this(context,null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, null,0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(getwidthMeasure(widthMeasureSpec), getheightMeasure(heightMeasureSpec));
    }

    private int getheightMeasure(int heightMeasureSpec) {
        int result =0;
        int measureMode = MeasureSpec.getMode(heightMeasureSpec);
        int measureSize = MeasureSpec.getSize(heightMeasureSpec);
        if(measureMode == MeasureSpec.EXACTLY){
            result = measureSize;
            return  result;
        }else {
            result =300;
            if(measureMode==MeasureSpec.AT_MOST){
                result = Math.min(measureSize,result);
            }
            return result;
        }

    }

    private int getwidthMeasure(int widthMeasureSpec) {
        int result =0;
        int measureMode = MeasureSpec.getMode(widthMeasureSpec);
        int measureSize = MeasureSpec.getSize(widthMeasureSpec);
        if(measureMode == MeasureSpec.EXACTLY){
            result = measureSize;
            return  result;
        }else {
            result =300;
            if(measureMode==MeasureSpec.AT_MOST){
                result = Math.min(measureSize,result);
            }
            return result;
        }
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int lastX = (int) event.getX();
        int lastY = (int) event.getY();
        switch (event.getAction()){
            case  MotionEvent.ACTION_DOWN:
                LastX = lastX;
                LastY = lastY;
                break;
            case  MotionEvent.ACTION_MOVE:
                int offX = (int) (lastX-LastX);
                int offY = (int) (lastY-LastY);
                layout(getLeft()+offX,getTop()+offY,getRight()+offX,getBottom()+offY);

                break;


        }
        return  true;
    }
}
