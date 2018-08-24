// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlatTransferFragment_ViewBinding implements Unbinder {
  private PlatTransferFragment target;

  private View view2131296642;

  private View view2131296639;

  private View view2131296338;

  @UiThread
  public PlatTransferFragment_ViewBinding(final PlatTransferFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.plat_type, "field 'platType' and method 'selectDonw'");
    target.platType = Utils.castView(view, R.id.plat_type, "field 'platType'", LinearLayout.class);
    view2131296642 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.selectDonw(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.plat_from, "field 'platFrom' and method 'selectDonw'");
    target.platFrom = Utils.castView(view, R.id.plat_from, "field 'platFrom'", LinearLayout.class);
    view2131296639 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.selectDonw(p0);
      }
    });
    target.imageType = Utils.findRequiredViewAsType(source, R.id.image_type, "field 'imageType'", ImageView.class);
    target.imageFrom = Utils.findRequiredViewAsType(source, R.id.image_plat, "field 'imageFrom'", ImageView.class);
    target.transferAmount = Utils.findRequiredViewAsType(source, R.id.transfer_amount, "field 'transferAmount'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_submit, "field 'btnSubmit' and method 'btnSubmit'");
    target.btnSubmit = Utils.castView(view, R.id.btn_submit, "field 'btnSubmit'", Button.class);
    view2131296338 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.btnSubmit();
      }
    });
    target.platFunds = Utils.findRequiredViewAsType(source, R.id.plat_funds, "field 'platFunds'", TextView.class);
    target.channelFunds = Utils.findRequiredViewAsType(source, R.id.channel_funds, "field 'channelFunds'", TextView.class);
    target.textFrom = Utils.findRequiredViewAsType(source, R.id.text_from, "field 'textFrom'", TextView.class);
    target.textTo = Utils.findRequiredViewAsType(source, R.id.text_to, "field 'textTo'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlatTransferFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.platType = null;
    target.platFrom = null;
    target.imageType = null;
    target.imageFrom = null;
    target.transferAmount = null;
    target.btnSubmit = null;
    target.platFunds = null;
    target.channelFunds = null;
    target.textFrom = null;
    target.textTo = null;

    view2131296642.setOnClickListener(null);
    view2131296642 = null;
    view2131296639.setOnClickListener(null);
    view2131296639 = null;
    view2131296338.setOnClickListener(null);
    view2131296338 = null;
  }
}
