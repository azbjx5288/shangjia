// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LottoRecyclerViewAdapter$ViewHolder_ViewBinding implements Unbinder {
  private LottoRecyclerViewAdapter.ViewHolder target;

  @UiThread
  public LottoRecyclerViewAdapter$ViewHolder_ViewBinding(LottoRecyclerViewAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.logo = Utils.findRequiredViewAsType(source, R.id.home_lottery_ico, "field 'logo'", ImageView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.recentlyplayed_name, "field 'name'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LottoRecyclerViewAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.logo = null;
    target.name = null;
  }
}
