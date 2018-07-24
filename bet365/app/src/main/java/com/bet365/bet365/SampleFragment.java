package com.bet365.bet365;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 每个Tab中的fragment
 * 
 * @author way
 * 
 */
public class SampleFragment extends Fragment {

	private static final String ARG_TEXT = "text";

	public static SampleFragment newInstance(String text) {
		SampleFragment f = new SampleFragment();

		Bundle args = new Bundle();
		args.putString(ARG_TEXT, text);
		f.setArguments(args);

		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_sample, container, false);

		((TextView) v.findViewById(R.id.text)).setText(getArguments()
				.getString(ARG_TEXT));
		return v;
	}
}
