// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GameHistoryAdapter$ViewHolder_ViewBinding implements Unbinder {
  private GameHistoryAdapter.ViewHolder target;

  @UiThread
  public GameHistoryAdapter$ViewHolder_ViewBinding(GameHistoryAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.name = Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
    target.gamename = Utils.findRequiredViewAsType(source, R.id.game_name, "field 'gamename'", TextView.class);
    target.money = Utils.findRequiredViewAsType(source, R.id.money, "field 'money'", TextView.class);
    target.time = Utils.findRequiredViewAsType(source, R.id.time, "field 'time'", TextView.class);
    target.state = Utils.findRequiredViewAsType(source, R.id.state, "field 'state'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GameHistoryAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.name = null;
    target.gamename = null;
    target.money = null;
    target.time = null;
    target.state = null;
  }
}
