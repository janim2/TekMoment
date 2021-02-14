package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tekmoment.classmomentschool.databinding.ActivityMenuBinding;
import com.tekmoment.classmomentschool.databinding.ActivitySchoolDashboardBinding;

public class MenuActivity extends AppCompatActivity {

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}