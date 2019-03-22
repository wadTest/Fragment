package com.prospec.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment {
    public MyFragment(){
    }
    public static MyFragment newInstance(String string){
        MyFragment fragment = new MyFragment();

        Bundle backbox = new Bundle();
        backbox.putString("text",string);
        fragment.setArguments(backbox);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        TextView textView = view.findViewById(R.id.myTextView);
        String string = getArguments() != null ? getArguments().getString("text") : "Hello MyFragment";
        textView.setText(string);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
//        view.findViewById(R.id.myTextView).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ((TextView)view).setText("ok clicked");
//            }
//        });
        return view;

    }
}
