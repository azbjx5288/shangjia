// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import com.goldenmango.lottery.component.ClipImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class QRCodeFragment_ViewBinding implements Unbinder {
  private QRCodeFragment target;

  private View view2131296666;

  private View view16908332;

  @UiThread
  public QRCodeFragment_ViewBinding(QRCodeFragment target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public QRCodeFragment_ViewBinding(final QRCodeFragment target, View source) {
    this.target = target;

    View view;
    target.webHtml = Utils.findRequiredViewAsType(source, R.id.web_html, "field 'webHtml'", WebView.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.image, "field 'imageView'", ClipImageView.class);
    view = Utils.findRequiredView(source, R.id.qrcode, "field 'qrcodeLayout' and method 'onClick'");
    target.qrcodeLayout = Utils.castView(view, R.id.qrcode, "field 'qrcodeLayout'", LinearLayout.class);
    view2131296666 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.rechargeOrders = Utils.findRequiredViewAsType(source, R.id.recharge_orders, "field 'rechargeOrders'", TextView.class);
    target.rechargePayamt = Utils.findRequiredViewAsType(source, R.id.recharge_payamt, "field 'rechargePayamt'", TextView.class);
    target.qrcodeTip = Utils.findRequiredViewAsType(source, R.id.qrcode_tip, "field 'qrcodeTip'", TextView.class);
    view = Utils.findRequiredView(source, android.R.id.home, "method 'onClick'");
    view16908332 = view;
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
    QRCodeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.webHtml = null;
    target.imageView = null;
    target.qrcodeLayout = null;
    target.rechargeOrders = null;
    target.rechargePayamt = null;
    target.qrcodeTip = null;

    view2131296666.setOnClickListener(null);
    view2131296666 = null;
    view16908332.setOnClickListener(null);
    view16908332 = null;
  }
}
