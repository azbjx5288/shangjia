// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShoppingFragment_ViewBinding implements Unbinder {
  private ShoppingFragment target;

  private View view2131296557;

  private View view2131296361;

  @UiThread
  public ShoppingFragment_ViewBinding(final ShoppingFragment target, View source) {
    this.target = target;

    View view;
    target.shoppingList = Utils.findRequiredViewAsType(source, R.id.shopping_list, "field 'shoppingList'", ListView.class);
    target.balanceText = Utils.findRequiredViewAsType(source, R.id.lottery_shopping_balance, "field 'balanceText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.lottery_shopping_buy, "field 'shopping_buy' and method 'total'");
    target.shopping_buy = Utils.castView(view, R.id.lottery_shopping_buy, "field 'shopping_buy'", Button.class);
    view2131296557 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.total();
      }
    });
    target.chaseaddNumberLayout = Utils.findRequiredView(source, R.id.chaseadd_number_layout, "field 'chaseaddNumberLayout'");
    target.appendSettings = Utils.findRequiredViewAsType(source, R.id.shopping_append_settings, "field 'appendSettings'", CheckBox.class);
    view = Utils.findRequiredView(source, R.id.chase_button, "method 'chase'");
    view2131296361 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chase();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ShoppingFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.shoppingList = null;
    target.balanceText = null;
    target.shopping_buy = null;
    target.chaseaddNumberLayout = null;
    target.appendSettings = null;

    view2131296557.setOnClickListener(null);
    view2131296557 = null;
    view2131296361.setOnClickListener(null);
    view2131296361 = null;
  }
}
