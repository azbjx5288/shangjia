// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentHistory_ViewBinding implements Unbinder {
  private FragmentHistory target;

  private View view2131296524;

  @UiThread
  public FragmentHistory_ViewBinding(final FragmentHistory target, View source) {
    this.target = target;

    View view;
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'refreshLayout'", SwipeRefreshLayout.class);
    view = Utils.findRequiredView(source, R.id.list, "field 'listView' and method 'onItemClick'");
    target.listView = Utils.castView(view, R.id.list, "field 'listView'", ListView.class);
    view2131296524 = view;
    ((AdapterView<?>) view).setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onItemClick(p2);
      }
    });
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.radioGroup, "field 'radioGroup'", RadioGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentHistory target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.refreshLayout = null;
    target.listView = null;
    target.radioGroup = null;

    ((AdapterView<?>) view2131296524).setOnItemClickListener(null);
    view2131296524 = null;
  }
}
