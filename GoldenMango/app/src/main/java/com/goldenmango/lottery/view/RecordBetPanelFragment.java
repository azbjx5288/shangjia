package com.goldenmango.lottery.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goldenmango.lottery.R;
import com.goldenmango.lottery.app.BaseFragment;
import com.goldenmango.lottery.app.GoldenMangoApp;
import com.goldenmango.lottery.data.Lottery;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import java.util.List;

public class RecordBetPanelFragment extends BaseFragment{

	private SmartTabLayout tabLayout;
	private ViewPager viewPager;
	private List<Lottery> lotteries= GoldenMangoApp.getUserCentre().getLotteryList();

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_recordbet, container, false);
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		tabLayout=(SmartTabLayout)findViewById(R.id.bet_tab);
		viewPager=(ViewPager)findViewById(R.id.bet_pager);
		initView();
	}

	private void initView() {
		FragmentPagerItems.Creator creator = FragmentPagerItems.with(getContext());
		for (int i = 0; i < lotteries.size(); i++) {
			Lottery lottery=lotteries.get(i);
			Bundle bundle = new Bundle();
			bundle.putInt("typeBet", lottery.getId());
			creator.add(lottery.getName(), BetPanelFragment.class,bundle);
		}
		FragmentPagerItems items=creator.create();

		FragmentPagerItemAdapter adapter=new FragmentPagerItemAdapter(getChildFragmentManager(), items);
		viewPager.setOffscreenPageLimit(items.size());
		viewPager.setAdapter(adapter);
		tabLayout.setViewPager(viewPager);
	}

	@Override
	public void onResume() {
		tabLayout.getTabAt(0);
		super.onResume();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}
}
