// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DrawFragment_ViewBinding implements Unbinder {
  private DrawFragment target;

  private View view2131296801;

  @UiThread
  public DrawFragment_ViewBinding(final DrawFragment target, View source) {
    this.target = target;

    View view;
    target.scrollView = Utils.findRequiredViewAsType(source, R.id.scrollView, "field 'scrollView'", ScrollView.class);
    target.money = Utils.findRequiredViewAsType(source, R.id.money, "field 'money'", TextView.class);
    target.cardNumber = Utils.findRequiredViewAsType(source, R.id.card_number, "field 'cardNumber'", TextView.class);
    target.cardArea = Utils.findRequiredViewAsType(source, R.id.card_area, "field 'cardArea'", TextView.class);
    target.cardBranch = Utils.findRequiredViewAsType(source, R.id.card_branch, "field 'cardBranch'", TextView.class);
    target.fundPassword = Utils.findRequiredViewAsType(source, R.id.fund_password, "field 'fundPassword'", EditText.class);
    target.drawMoneyEditText = Utils.findRequiredViewAsType(source, R.id.draw_money, "field 'drawMoneyEditText'", EditText.class);
    target.cardInfo = Utils.findRequiredViewAsType(source, R.id.card_info, "field 'cardInfo'", ViewGroup.class);
    target.cardInfoNoCard = Utils.findRequiredView(source, R.id.card_info_no_card, "field 'cardInfoNoCard'");
    view = Utils.findRequiredView(source, R.id.submit, "method 'onClickSubmit'");
    view2131296801 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSubmit();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    DrawFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.scrollView = null;
    target.money = null;
    target.cardNumber = null;
    target.cardArea = null;
    target.cardBranch = null;
    target.fundPassword = null;
    target.drawMoneyEditText = null;
    target.cardInfo = null;
    target.cardInfoNoCard = null;

    view2131296801.setOnClickListener(null);
    view2131296801 = null;
  }
}
