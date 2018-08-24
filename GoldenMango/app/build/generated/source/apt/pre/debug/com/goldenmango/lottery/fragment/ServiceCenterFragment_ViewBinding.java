// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ServiceCenterFragment_ViewBinding implements Unbinder {
  private ServiceCenterFragment target;

  @UiThread
  public ServiceCenterFragment_ViewBinding(ServiceCenterFragment target, View source) {
    this.target = target;

    target.webView = Utils.findRequiredViewAsType(source, R.id.webView, "field 'webView'", WebView.class);
    target.netPrompt = Utils.findRequiredViewAsType(source, R.id.net_prompt, "field 'netPrompt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ServiceCenterFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.webView = null;
    target.netPrompt = null;
  }
}
