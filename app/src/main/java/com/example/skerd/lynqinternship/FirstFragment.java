package com.example.skerd.lynqinternship;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_layout, container, false);
        ImageView imageView= (ImageView) fragmentView.findViewById(R.id.imageView);
        // Inflate the layout for this fragment
        imageView.setImageResource(R.drawable.lynq);

        return fragmentView;

    }

}
