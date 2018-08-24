// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.game;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SdddsGame_ViewBinding implements Unbinder {
  private SdddsGame target;

  private View view2131296734;

  private View view2131296735;

  private View view2131296736;

  private View view2131296737;

  private View view2131296738;

  private View view2131296739;

  @UiThread
  public SdddsGame_ViewBinding(final SdddsGame target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.sddds_0, "method 'onTextClick'");
    view2131296734 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTextClick(Utils.castParam(p0, "doClick", 0, "onTextClick", 0, TextView.class));
      }
    });
    view = Utils.findRequiredView(source, R.id.sddds_1, "method 'onTextClick'");
    view2131296735 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTextClick(Utils.castParam(p0, "doClick", 0, "onTextClick", 0, TextView.class));
      }
    });
    view = Utils.findRequiredView(source, R.id.sddds_2, "method 'onTextClick'");
    view2131296736 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTextClick(Utils.castParam(p0, "doClick", 0, "onTextClick", 0, TextView.class));
      }
    });
    view = Utils.findRequiredView(source, R.id.sddds_3, "method 'onTextClick'");
    view2131296737 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTextClick(Utils.castParam(p0, "doClick", 0, "onTextClick", 0, TextView.class));
      }
    });
    view = Utils.findRequiredView(source, R.id.sddds_4, "method 'onTextClick'");
    view2131296738 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTextClick(Utils.castParam(p0, "doClick", 0, "onTextClick", 0, TextView.class));
      }
    });
    view = Utils.findRequiredView(source, R.id.sddds_5, "method 'onTextClick'");
    view2131296739 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTextClick(Utils.castParam(p0, "doClick", 0, "onTextClick", 0, TextView.class));
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131296734.setOnClickListener(null);
    view2131296734 = null;
    view2131296735.setOnClickListener(null);
    view2131296735 = null;
    view2131296736.setOnClickListener(null);
    view2131296736 = null;
    view2131296737.setOnClickListener(null);
    view2131296737 = null;
    view2131296738.setOnClickListener(null);
    view2131296738 = null;
    view2131296739.setOnClickListener(null);
    view2131296739 = null;
  }
}
