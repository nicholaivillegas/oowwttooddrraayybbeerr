package com.villegapps.owtodriver.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.villegapps.owtodriver.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by john.villegas on 18/10/2017.
 */

public class EarningsFragment extends Fragment implements View.OnClickListener {

    @Bind(R.id.text_previous_trip_label)
    TextView textPreviousTripLabel;
    @Bind(R.id.text_previous_trip_time)
    TextView textPreviousTripTime;
    @Bind(R.id.text_previous_earning_label)
    TextView textPreviousEarningLabel;
    @Bind(R.id.text_previous_earning)
    TextView textPreviousEarning;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_earnings, container, false);
        ButterKnife.bind(this, view);
        BarChart barChart = view.findViewById(R.id.chart);
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(12f, 3));
        entries.add(new BarEntry(18f, 4));
        entries.add(new BarEntry(9f, 5));

        BarDataSet dataset = new BarDataSet(entries, "# of Calls");
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        BarData data = new BarData(dataset);
        barChart.setData(data);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
