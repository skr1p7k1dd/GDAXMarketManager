package com.alexdoub.gdaxmanager.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.alexdoub.gdaxmanager.R;

/**
 * Created by Alex on 11/3/2017.
 */

public class CurrencyHeaderView extends LinearLayout {

    public CurrencyHeaderView(Context context) {
        super(context);
        init(context);
    }

    public CurrencyHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CurrencyHeaderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_currency_header, this, true);
    }
}
