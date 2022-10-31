package com.example.kukuapp2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class learning extends Fragment {
    Button Breeds , Learning , Housing , Health ;
    View binding;

    public learning() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = inflater.inflate(R.layout.fragment_learning, container, false);
        Breeds=(Button)binding.findViewById(R.id.breeds);
        Learning=(Button)binding.findViewById(R.id.Learnmore);
        Housing=(Button)binding.findViewById(R.id.housing);
        Health=(Button)binding.findViewById(R.id.health);
        Breeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Breeds.setVisibility(View.INVISIBLE);
                Health.setVisibility(View.INVISIBLE);
                Housing.setVisibility(View.INVISIBLE);
                FragmentTransaction fragment = getChildFragmentManager().beginTransaction();
                fragment.replace(R.id.frame1, new Health());
                fragment.commit();

            }

        });
        Health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Breeds.setVisibility(View.INVISIBLE);
                Health.setVisibility(View.INVISIBLE);
                Housing.setVisibility(View.INVISIBLE);
                FragmentTransaction fragment = getChildFragmentManager().beginTransaction();
                fragment.replace(R.id.frame1, new Health());
                fragment.commit();

            }
        });
        Housing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Breeds.setVisibility(View.INVISIBLE);
                Health.setVisibility(View.INVISIBLE);
                Housing.setVisibility(View.INVISIBLE);
                FragmentTransaction fragment = getChildFragmentManager().beginTransaction();
                fragment.replace(R.id.frame1, new Health());
                fragment.commit();
            }
        });
        return binding;
    }
}