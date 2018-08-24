// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WebViewFragment_ViewBinding implements Unbinder {
  private WebViewFragment target;

  @UiThread
  public WebViewFragment_ViewBinding(WebViewFragment target, View source) {
    this.target = target;

    target.appView = Utils.findRequiredViewAsType(source, R.id.gagame_WebView, "field 'appView'", WebView.class);
    target.loadingLayout = Utils.findRequiredViewAsType(source, R.id.loading_layout, "field 'loadingLayout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WebViewFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.appView = null;
    target.loadingLayout = null;
  }
}
