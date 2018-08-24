// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

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

public class FragmentUser_ViewBinding implements Unbinder {
  private FragmentUser target;

  private View view2131296316;

  private View view2131296915;

  private View view2131296689;

  private View view2131296602;

  private View view2131296400;

  private View view2131296855;

  private View view2131296615;

  private View view2131296750;

  private View view2131296895;

  private View view2131296561;

  private View view2131296355;

  private View view2131296545;

  private View view2131296693;

  @UiThread
  public FragmentUser_ViewBinding(final FragmentUser target, View source) {
    this.target = target;

    View view;
    target.userName = Utils.findRequiredViewAsType(source, R.id.user_name, "field 'userName'", TextView.class);
    target.userBalance = Utils.findRequiredViewAsType(source, R.id.user_balance, "field 'userBalance'", TextView.class);
    view = Utils.findRequiredView(source, R.id.balance_details, "method 'onClick'");
    view2131296316 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.withdraw_deposit, "method 'onClick'");
    view2131296915 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rebates_setting, "method 'onClick'");
    view2131296689 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.notice, "method 'onClick'");
    view2131296602 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.customer_service, "method 'onClick'");
    view2131296400 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.transfer_deposit, "method 'onClick'");
    view2131296855 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.password_setting, "method 'onClick'");
    view2131296615 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.security_setting, "method 'onClick'");
    view2131296750 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.version, "method 'onClick'");
    view2131296895 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.lower_setting, "method 'onClick'");
    view2131296561 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.card_setting, "method 'onClick'");
    view2131296355 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.logout, "method 'logout'");
    view2131296545 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.logout();
      }
    });
    view = Utils.findRequiredView(source, R.id.recharge, "method 'onRecharge'");
    view2131296693 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRecharge();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentUser target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.userName = null;
    target.userBalance = null;

    view2131296316.setOnClickListener(null);
    view2131296316 = null;
    view2131296915.setOnClickListener(null);
    view2131296915 = null;
    view2131296689.setOnClickListener(null);
    view2131296689 = null;
    view2131296602.setOnClickListener(null);
    view2131296602 = null;
    view2131296400.setOnClickListener(null);
    view2131296400 = null;
    view2131296855.setOnClickListener(null);
    view2131296855 = null;
    view2131296615.setOnClickListener(null);
    view2131296615 = null;
    view2131296750.setOnClickListener(null);
    view2131296750 = null;
    view2131296895.setOnClickListener(null);
    view2131296895 = null;
    view2131296561.setOnClickListener(null);
    view2131296561 = null;
    view2131296355.setOnClickListener(null);
    view2131296355 = null;
    view2131296545.setOnClickListener(null);
    view2131296545 = null;
    view2131296693.setOnClickListener(null);
    view2131296693 = null;
  }
}
