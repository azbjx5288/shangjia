// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShoppingAdapter$ViewHolder_ViewBinding implements Unbinder {
  private ShoppingAdapter.ViewHolder target;

  @UiThread
  public ShoppingAdapter$ViewHolder_ViewBinding(ShoppingAdapter.ViewHolder target, View source) {
    this.target = target;

    target.playName = Utils.findRequiredViewAsType(source, R.id.shopping_item_method, "field 'playName'", TextView.class);
    target.code = Utils.findRequiredViewAsType(source, R.id.shopping_item_code, "field 'code'", TextView.class);
    target.noteNumber = Utils.findRequiredViewAsType(source, R.id.shopping_item_notenum, "field 'noteNumber'", TextView.class);
    target.delButton = Utils.findRequiredViewAsType(source, R.id.shopping_item_delete, "field 'delButton'", ImageButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShoppingAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.playName = null;
    target.code = null;
    target.noteNumber = null;
    target.delButton = null;
  }
}
