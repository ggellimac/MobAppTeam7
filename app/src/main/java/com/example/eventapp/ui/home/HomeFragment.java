package com.example.eventapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.eventapp.EventDetails1;
import com.example.eventapp.EventDetails2;
import com.example.eventapp.EventDetails3;
import com.example.eventapp.EventDetails4;
import com.example.eventapp.EventDetails5;
import com.example.eventapp.EventDetails6;
import com.example.eventapp.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        LinearLayout getDetails = root.findViewById(R.id.event1);
        getDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), EventDetails1.class));

            }
        });

        LinearLayout getDetails2 = root.findViewById(R.id.event2);
        getDetails2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), EventDetails2.class));

            }
        });

        LinearLayout getDetails3 = root.findViewById(R.id.event3);
        getDetails3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), EventDetails3.class));

            }
        });

        LinearLayout getDetails4 = root.findViewById(R.id.event4);
        getDetails4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), EventDetails4.class));

            }
        });

        LinearLayout getDetails5 = root.findViewById(R.id.event5);
        getDetails5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), EventDetails5.class));

            }
        });

        LinearLayout getDetails6 = root.findViewById(R.id.event6);
        getDetails6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), EventDetails6.class));

            }
        });
     //   final TextView textView = root.findViewById(R.id.text_home);
    //    homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
     //       @Override
     //       public void onChanged(@Nullable String s) {
     //           textView.setText(s);
     //       }
    //    });
        return root;
        //just test some push
    }
}
