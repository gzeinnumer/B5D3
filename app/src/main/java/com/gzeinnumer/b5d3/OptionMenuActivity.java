package com.gzeinnumer.b5d3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.gzeinnumer.b5d3.databinding.ActivityOptionMenuBinding;

public class OptionMenuActivity extends AppCompatActivity {

    private ActivityOptionMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOptionMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = new FirstFragment();
        fragmentTransaction.replace(R.id.fr, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}