package com.mogomarket.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Map;

public class AssetAllocationChart extends View {
    public AssetAllocationChart(Context context) {
        super(context);
    }
    public AssetAllocationChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    public AssetAllocationChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setAllocation(Map<String, Double> allocation) {
        invalidate();
    }
}
