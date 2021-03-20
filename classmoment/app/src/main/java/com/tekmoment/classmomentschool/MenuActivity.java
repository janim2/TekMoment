package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tekmoment.classmomentschool.Helpers.Functions;
import com.tekmoment.classmomentschool.Helpers.User_categories;
import com.tekmoment.classmomentschool.PopupClasses.AllPopups;
import com.tekmoment.classmomentschool.databinding.ActivityMenuBinding;
import com.tekmoment.classmomentschool.databinding.ActivitySchoolDashboardBinding;

public class MenuActivity extends AppCompatActivity {

    private ActivityMenuBinding binding;

    private Functions           helpers;

    private String              user_type = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        helpers     = new Functions(this);

        user_type   = helpers.getString("user_type");

        binding.goBack.setOnClickListener(view1 -> finish());

        if(user_type.equals(new User_categories().tutors())){
            binding.notifications.setVisibility(View.VISIBLE);
            binding.profile.setVisibility(View.VISIBLE);
        }
        else{
            binding.mySchool.setVisibility(View.VISIBLE);
        }

        binding.logout.setOnClickListener(view12 -> {
            new AllPopups(this).LogoutDialog();
        });
    }
}