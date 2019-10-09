package com.example.facedetectiondemo.Helper;

import android.graphics.*;

public class RectOverlay extends GrapicOverlay.Graphic
{
    private int  mRectColor = Color.GREEN;
    private float mStrokeWidth = 4.0f;
    private Paint mRectPaint;
    private GrapicOverlay graphicOverlay;
    private Rect rect;

    public RectOverlay(GrapicOverlay graphicOverlay, Rect rect)
    {
        super(graphicOverlay);

        mRectPaint = new Paint();
        mRectPaint.setColor(mRectColor);
        mRectPaint.setStyle(Paint.Style.STROKE);
        mRectPaint.setStrokeWidth(mStrokeWidth);

        this.graphicOverlay = graphicOverlay;
        this.rect = rect;

        postInvalidate();
    }

    @Override
    public void draw(Canvas canvas)
    {
        RectF rectF = new RectF(rect);
        rectF.left = translateX(rectF.left);
        rectF.right = translateX(rectF.right);
        rectF.top = translateX(rectF.top);
        rectF.bottom = translateX(rectF.bottom);

        canvas.drawRect(rectF,mRectPaint);
    }
}

