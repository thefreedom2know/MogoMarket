package com.mogomarket.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class PortfolioTrendView extends View {
    public PortfolioTrendView(Context context) {
        super(context);
    }
    public PortfolioTrendView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    public PortfolioTrendView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setChangePercent(float percent, int color) {
        invalidate();
    }
}
