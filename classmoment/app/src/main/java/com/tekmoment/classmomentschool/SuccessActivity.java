package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tekmoment.classmomentschool.databinding.ActivitySchoolDashboardBinding;
import com.tekmoment.classmomentschool.databinding.ActivitySuccessBinding;

public class SuccessActivity extends AppCompatActivity {

    private ActivitySuccessBinding      binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySuccessBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //making the goto dashboard button functional
        binding.continueButton.setOnClickListener(view1 -> {
            //moving to the next screen the school dashboard screen
            startActivity(new Intent(SuccessActivity.this, SchoolDashboardActivity.class));
        });
    }
}