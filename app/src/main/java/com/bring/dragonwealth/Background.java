package com.bring.dragonwealth;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background {

    int x = 0, y = 0;
    Bitmap background;

    Background (int screenX, int screenY, Resources res) {

        background = BitmapFactory.decodeResource(res, R.drawable.game_bg);
        background = Bitmap.createScaledBitmap(background, screenX, screenY, false);

        int max = 10;
        int min = 1;
        int range = max - min + 1;


        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;


            System.out.println(rand);
        }

    }

}
