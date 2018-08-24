// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import com.goldenmango.lottery.component.CountdownView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BankCardSetting_ViewBinding implements Unbinder {
  private BankCardSetting target;

  private View view2131296294;

  private View view2131296539;

  private View view16908332;

  @UiThread
  public BankCardSetting_ViewBinding(final BankCardSetting target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.add_menu, "field 'add_menu' and method 'onClick'");
    target.add_menu = Utils.castView(view, R.id.add_menu, "field 'add_menu'", ImageView.class);
    view2131296294 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.bindcardList = Utils.findRequiredViewAsType(source, R.id.bindcatrd_list, "field 'bindcardList'", ListView.class);
    target.tip = Utils.findRequiredViewAsType(source, R.id.tip, "field 'tip'", TextView.class);
    target.addArea = Utils.findRequiredViewAsType(source, R.id.add_area, "field 'addArea'", LinearLayout.class);
    target.locking_but = Utils.findRequiredViewAsType(source, R.id.locking_but, "field 'locking_but'", Button.class);
    view = Utils.findRequiredView(source, R.id.locking_time, "field 'lockingTimeBut' and method 'clickBankcard'");
    target.lockingTimeBut = Utils.castView(view, R.id.locking_time, "field 'lockingTimeBut'", CountdownView.class);
    view2131296539 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickBankcard(p0);
      }
    });
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
    BankCardSetting target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.add_menu = null;
    target.bindcardList = null;
    target.tip = null;
    target.addArea = null;
    target.locking_but = null;
    target.lockingTimeBut = null;

    view2131296294.setOnClickListener(null);
    view2131296294 = null;
    view2131296539.setOnClickListener(null);
    view2131296539 = null;
    view16908332.setOnClickListener(null);
    view16908332 = null;
  }
}
