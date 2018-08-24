package com.goldenmango.lottery.pattern;

import android.view.View;
import android.widget.TextView;

import com.goldenmango.lottery.R;
import com.goldenmango.lottery.view.DrawCodeView;
import com.goldenmango.lottery.view.DrawTrendView;

/**
 * Created by ACE-PC on 2016/3/11.
 */
public class CodeView{

    private static final String TAG = CodeView.class.getSimpleName();
    private DrawCodeView drawCodeView;
    public CodeView(View trendView, String title){
        ((TextView) trendView.findViewById(R.id.code_column_title)).setText(title);
        drawCodeView = (DrawCodeView) trendView.findViewById(R.id.codeview);
    }

    public void setCodeData(Object trendArray){
        drawCodeView.setData(trendArray);
    }

    public void requestLayout() {
        if (drawCodeView != null && !drawCodeView.isLayoutRequested()) {
            drawCodeView.requestLayout();
        }
    }
}
