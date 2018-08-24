// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BetOrTraceDetailFragment_ViewBinding implements Unbinder {
  private BetOrTraceDetailFragment target;

  private View view2131296339;

  @UiThread
  public BetOrTraceDetailFragment_ViewBinding(final BetOrTraceDetailFragment target, View source) {
    this.target = target;

    View view;
    target.webView = Utils.findRequiredViewAsType(source, R.id.webView, "field 'webView'", WebView.class);
    view = Utils.findRequiredView(source, R.id.button, "field 'button' and method 'onClick'");
    target.button = Utils.castView(view, R.id.button, "field 'button'", Button.class);
    view2131296339 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    BetOrTraceDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.webView = null;
    target.button = null;

    view2131296339.setOnClickListener(null);
    view2131296339 = null;
  }
}
