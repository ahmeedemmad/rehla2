package com.NativeTech.rehla.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by TWINS on 04/08/15.
 */
public class AllerRegular extends android.support.v7.widget.AppCompatTextView {

    public AllerRegular(Context context, AttributeSet attrs,
                        int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public AllerRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AllerRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
      /*  Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "fonts/Aller_Rg.ttf");
        setTypeface(tf);*/
    }
}