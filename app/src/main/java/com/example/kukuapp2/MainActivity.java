package com.example.kukuapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstFragmentBtn, secondFragmentBtn, learningFragmentbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragmentBtn = findViewById(R.id.fragment1btn);
        secondFragmentBtn = findViewById(R.id.fragment2btn);
        learningFragmentbtn = findViewById(R.id.Learnmore);
        replaceFragment(new fragment1());

        firstFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                learningFragmentbtn.setVisibility(View.VISIBLE);

                replaceFragment(new fragment1());

            }
        });

        secondFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learningFragmentbtn.setVisibility(View.INVISIBLE);
                replaceFragment(new fragment2());

            }
        });
        learningFragmentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learningFragmentbtn.setVisibility(View.INVISIBLE);
                replaceFragment(new learning());

            }
        });




    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }
}