package own.ownclockwidget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Image {

        private static final String LOG = Image.class.getSimpleName();


        static SimpleDateFormat time = new SimpleDateFormat("h:mm:ss");
        static SimpleDateFormat ampm = new SimpleDateFormat("a");


        static Bitmap buildImage(Context context) {
                Bitmap myBitmap = Bitmap.createBitmap(400, 200, Bitmap.Config.ARGB_8888);
                String currenttime =  time.format(new Date());
                String currentampm =  ampm.format(new Date());
                Log.i(LOG, "My Clock Image built with " + currenttime + ":" + currentampm);
                Canvas myCanvas = new Canvas(myBitmap);
                Paint paint = new Paint();
                ///Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/MouseLEDUmod.ttf");
                ///Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/DS-DIGIB.TTF");
                Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/PixelLCD-7.ttf");
                paint.setAntiAlias(true);
                paint.setSubpixelText(true);
                paint.setTypeface(font);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(Color.CYAN);
                paint.setTextSize(48);
                paint.setTextAlign(Paint.Align.CENTER);
                myCanvas.drawText(currenttime, 170, 100, paint);
                paint.setTextSize(30);
                myCanvas.drawText(currentampm, 350, 100, paint);
                return myBitmap;


        }






}