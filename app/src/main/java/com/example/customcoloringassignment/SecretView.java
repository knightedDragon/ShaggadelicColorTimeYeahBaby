package com.example.customcoloringassignment;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * @Author Kathryn Weidman
 * @Version Feb. 10, 2022
 *
 * An unfinished coloring assignment
 *
 * */

public class SecretView extends SurfaceView {

    //paints used in image of butterfly
    Paint butterflyBody = new Paint();
    Paint bottomLeftWing = new Paint();
    Paint bottomRightWing = new Paint();
    Paint topLeftWing = new Paint();
    Paint topRightWing = new Paint();

    //hardcoded values for butterfly dimensions
    public static final float butterflyX = 100.0f;
    public static final float butterflyY = 100.0f;
    public static final float bodyWidth = 50.0f;
    public static final float bodyHeight = 100.0f;
    public static final float topWingWidth = 400.0f;
    public static final float topWingHeight = 400.0f;
    public static final float bottomWingWidth = 300.0f;
    public static final float bottomWingHeight = 300.0f;

    public int getRed() {
        return 0;
    }
    public int getGreen() {
        return 0;
    }
    public int getBlue() {
        return 0;
    }

    private void setRed() {

    }
    private void setGreen() {

    }
    private void setBlue() {

    }


    //Inherited Method
    public SecretView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        setWillNotDraw(false);

        //These will be changeable by seekbars later
        setBackgroundColor(Color.BLACK);
        butterflyBody.setColor(Color.WHITE);
        bottomLeftWing.setColor(Color.YELLOW);
        bottomRightWing.setColor(Color.RED);
        topLeftWing.setColor(Color.BLUE);
        topRightWing.setColor(Color.GREEN);

    }

    public void drawButterfly(Canvas canvas, Float x, Float y) {
        //coordinates for where the top left corner of the body is
        float bodyX = x + topWingWidth;
        float bodyY = y + topWingHeight/2;

        canvas.drawRect(x, y, x + topWingWidth, y + topWingHeight, topLeftWing);
        canvas.drawOval(bodyX, bodyY, bodyX + bodyWidth, bodyY + bodyHeight, butterflyBody);
        canvas.drawRect(bodyX + bodyWidth, y, bodyX + bodyWidth + topWingWidth,
                y + topWingHeight, topRightWing);

    }

    @Override
    public void onDraw(Canvas canvas) {
        drawButterfly(canvas, butterflyX, butterflyY);
    }
}
