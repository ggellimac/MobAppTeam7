package com.example.eventapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.eventapp.EventDetails;
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
                startActivity(new Intent(getActivity().getApplicationContext(), EventDetails.class));

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
