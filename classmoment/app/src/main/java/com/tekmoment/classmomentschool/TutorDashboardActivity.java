package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.tekmoment.classmomentschool.PopupClasses.AllPopups;
import com.tekmoment.classmomentschool.databinding.ActivityLoginBinding;
import com.tekmoment.classmomentschool.databinding.ActivityTutorDashboardBinding;

public class TutorDashboardActivity extends AppCompatActivity {

    private ActivityTutorDashboardBinding binding;

    private Dialog                        dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tutor_dashboard);
        binding = ActivityTutorDashboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.menuImage.setOnClickListener(view1 -> {
            startActivity(new Intent(this, MenuActivity.class));
        });

        binding.studentsLayout.setOnClickListener(view12 -> {
            startActivity(new Intent(this, MyStudentsActivity.class));
        });

        binding.recordLayout.setOnClickListener(view12 -> {
//            startActivity(new Intent(this, MyStudentsActivity.class));
        });

        binding.classesLayout.setOnClickListener(view13 -> {
            startActivity(new Intent(this, MyClassesActivity.class));
        });

        binding.addClassImage.setOnClickListener(view12 -> {
            AddClassDialog();
        });

        binding.logoutLayout.setOnClickListener(view12 -> {
            new AllPopups(this).LogoutDialog();
        });
    }

    private void AddClassDialog(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.add_course_popup);

        dialog.findViewById(R.id.btnClose).setOnClickListener(view -> {
            dialog.dismiss();
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT)));
        dialog.show();
    }

}