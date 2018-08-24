// Generated code from Butter Knife. Do not modify!
package com.goldenmango.lottery.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.goldenmango.lottery.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HistoryLotteryAdapter$ViewHolder_ViewBinding implements Unbinder {
  private HistoryLotteryAdapter.ViewHolder target;

  @UiThread
  public HistoryLotteryAdapter$ViewHolder_ViewBinding(HistoryLotteryAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.lottery_history_title, "field 'title'", TextView.class);
    target.issue = Utils.findRequiredViewAsType(source, R.id.lottery_history_issue, "field 'issue'", TextView.class);
    target.ballList = Utils.findRequiredViewAsType(source, R.id.lottery_history_code, "field 'ballList'", LinearLayout.class);
    target.divideline = Utils.findRequiredView(source, R.id.divideline, "field 'divideline'");
    target.otherList = Utils.findRequiredViewAsType(source, R.id.lottery_trend_other_list, "field 'otherList'", LinearLayout.class);
    target.otherMore = Utils.findRequiredView(source, R.id.lottery_other_more, "field 'otherMore'");
    target.historyBet = Utils.findRequiredViewAsType(source, R.id.lottery_history_bet, "field 'historyBet'", TextView.class);
    target.trendIcon = Utils.findRequiredViewAsType(source, R.id.trend_icon, "field 'trendIcon'", ImageView.class);
    target.kuaisanLayout = Utils.findRequiredViewAsType(source, R.id.kuaisanLayout, "field 'kuaisanLayout'", LinearLayout.class);
    target.kuaisanDice1 = Utils.findRequiredViewAsType(source, R.id.kuaisanDice1, "field 'kuaisanDice1'", ImageView.class);
    target.kuaisanDice2 = Utils.findRequiredViewAsType(source, R.id.kuaisanDice2, "field 'kuaisanDice2'", ImageView.class);
    target.kuaisanDice3 = Utils.findRequiredViewAsType(source, R.id.kuaisanDice3, "field 'kuaisanDice3'", ImageView.class);
    target.kuaisanSum = Utils.findRequiredViewAsType(source, R.id.kuaisanSum, "field 'kuaisanSum'", TextView.class);
    target.kuaisanSize = Utils.findRequiredViewAsType(source, R.id.kuaisanSize, "field 'kuaisanSize'", TextView.class);
    target.kuaisanOdd = Utils.findRequiredViewAsType(source, R.id.kuaisanOdd, "field 'kuaisanOdd'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HistoryLotteryAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.issue = null;
    target.ballList = null;
    target.divideline = null;
    target.otherList = null;
    target.otherMore = null;
    target.historyBet = null;
    target.trendIcon = null;
    target.kuaisanLayout = null;
    target.kuaisanDice1 = null;
    target.kuaisanDice2 = null;
    target.kuaisanDice3 = null;
    target.kuaisanSum = null;
    target.kuaisanSize = null;
    target.kuaisanOdd = null;
  }
}
