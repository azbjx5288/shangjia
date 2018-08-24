// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdvertisementFragment_ViewBinding implements Unbinder {
  private AdvertisementFragment target;

  @UiThread
  public AdvertisementFragment_ViewBinding(AdvertisementFragment target, View source) {
    this.target = target;

    target.home = Utils.findRequiredViewAsType(source, android.R.id.home, "field 'home'", ImageButton.class);
    target.title = Utils.findRequiredViewAsType(source, android.R.id.title, "field 'title'", TextView.class);
    target.appView = Utils.findRequiredViewAsType(source, R.id.payWebView, "field 'appView'", WebView.class);
    target.loadingLayout = Utils.findRequiredViewAsType(source, R.id.loading_layout, "field 'loadingLayout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdvertisementFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.home = null;
    target.title = null;
    target.appView = null;
    target.loadingLayout = null;
  }
}
