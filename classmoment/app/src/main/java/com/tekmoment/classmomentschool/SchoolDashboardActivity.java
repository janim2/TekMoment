package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tekmoment.classmomentschool.databinding.ActivityRegisterSchoolBinding;
import com.tekmoment.classmomentschool.databinding.ActivitySchoolDashboardBinding;

public class SchoolDashboardActivity extends AppCompatActivity {

    private ActivitySchoolDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySchoolDashboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}