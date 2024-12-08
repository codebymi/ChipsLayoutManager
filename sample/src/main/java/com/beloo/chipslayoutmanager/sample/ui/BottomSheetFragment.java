package com.beloo.chipslayoutmanager.sample.ui;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beloo.chipslayoutmanager.sample.entity.ChipsEntity;
import com.beloo.chipslayoutmanager.sample.ui.adapter.ChipsAdapter;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;

import java.util.List;

import com.beloo.chipslayoutmanager.sample.R;

/**
 */
public class BottomSheetFragment extends Fragment {

    public BottomSheetFragment() {
        // Required empty public constructor
    }

    public static BottomSheetFragment newInstance() {
        Bundle args = new Bundle();
        BottomSheetFragment fragment = new BottomSheetFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
    }



}
