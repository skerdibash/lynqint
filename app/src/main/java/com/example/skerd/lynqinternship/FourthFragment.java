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
public class FourthFragment extends Fragment {


    public FourthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.activity_main, container, false);
        ImageView imageView= (ImageView) fragmentView.findViewById(R.id.imageView);
        // Inflate the layout for this fragment
        imageView.setImageResource(R.drawable.barclays);

        return fragmentView;

    }

}
