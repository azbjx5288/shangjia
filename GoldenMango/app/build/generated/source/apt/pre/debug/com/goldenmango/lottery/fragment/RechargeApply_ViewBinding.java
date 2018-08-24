// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import com.goldenmango.lottery.component.WrapContentHeightViewPager;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RechargeApply_ViewBinding implements Unbinder {
  private RechargeApply target;

  private View view2131296338;

  private View view2131296673;

  private View view2131296671;

  private View view2131296674;

  private View view2131296672;

  @UiThread
  public RechargeApply_ViewBinding(final RechargeApply target, View source) {
    this.target = target;

    View view;
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.radioGroup, "field 'radioGroup'", RadioGroup.class);
    target.viewpagerRecharge = Utils.findRequiredViewAsType(source, R.id.viewpagerRecharge, "field 'viewpagerRecharge'", WrapContentHeightViewPager.class);
    target.amountsMark = Utils.findRequiredViewAsType(source, R.id.amounts_mark, "field 'amountsMark'", TextView.class);
    target.editOrderamount = Utils.findRequiredViewAsType(source, R.id.edit_orderamount, "field 'editOrderamount'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_submit, "field 'btnSubmit' and method 'onSubmitDone'");
    target.btnSubmit = Utils.castView(view, R.id.btn_submit, "field 'btnSubmit'", Button.class);
    view2131296338 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubmitDone();
      }
    });
    target.currency = Utils.findRequiredViewAsType(source, R.id.currency, "field 'currency'", TextView.class);
    view = Utils.findRequiredView(source, R.id.quota_50, "method 'onClick'");
    view2131296673 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.quota_100, "method 'onClick'");
    view2131296671 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.quota_500, "method 'onClick'");
    view2131296674 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.quota_1000, "method 'onClick'");
    view2131296672 = view;
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
    RechargeApply target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.radioGroup = null;
    target.viewpagerRecharge = null;
    target.amountsMark = null;
    target.editOrderamount = null;
    target.btnSubmit = null;
    target.currency = null;

    view2131296338.setOnClickListener(null);
    view2131296338 = null;
    view2131296673.setOnClickListener(null);
    view2131296673 = null;
    view2131296671.setOnClickListener(null);
    view2131296671 = null;
    view2131296674.setOnClickListener(null);
    view2131296674 = null;
    view2131296672.setOnClickListener(null);
    view2131296672 = null;
  }
}
