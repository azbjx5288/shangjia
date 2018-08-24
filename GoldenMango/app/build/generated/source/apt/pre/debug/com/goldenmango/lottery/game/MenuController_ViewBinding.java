// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.game;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import com.goldenmango.lottery.component.TagCloudView;
import com.goldenmango.lottery.view.TableMenu;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MenuController_ViewBinding implements Unbinder {
  private MenuController target;

  @UiThread
  public MenuController_ViewBinding(MenuController target, View source) {
    this.target = target;

    target.tableMenu = Utils.findRequiredViewAsType(source, R.id.tableMenu, "field 'tableMenu'", TableMenu.class);
    target.preference = Utils.findRequiredViewAsType(source, R.id.preference, "field 'preference'", TagCloudView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MenuController target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tableMenu = null;
    target.preference = null;
  }
}
