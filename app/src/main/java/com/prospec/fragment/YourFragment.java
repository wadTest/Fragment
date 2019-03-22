package com.prospec.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class YourFragment extends Fragment {

public YourFragment(){}

public static YourFragment newInstance(String text){
    YourFragment yourFragment = new YourFragment();

    Bundle blackbox = new Bundle();
    blackbox.putString("text", text);
    yourFragment.setArguments(blackbox);

    return yourFragment;
}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_your, container, false);
        TextView textView = view.findViewById(R.id.textView);
        textView.setText(getArguments().getString("text"));

        return view;
    }
}
