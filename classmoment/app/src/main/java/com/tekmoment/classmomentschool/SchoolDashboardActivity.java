package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.tekmoment.classmomentschool.databinding.ActivityRegisterSchoolBinding;
import com.tekmoment.classmomentschool.databinding.ActivitySchoolDashboardBinding;

public class SchoolDashboardActivity extends AppCompatActivity {

    private ActivitySchoolDashboardBinding binding;

    private Dialog                         dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySchoolDashboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //menu
        binding.menuImage.setOnClickListener(view12 -> {
            startActivity(new Intent(SchoolDashboardActivity.this, MenuActivity.class));
        });

        //students
        binding.studentsImage.setOnClickListener(view1 -> {
            AddStudentDialog();
        });

        //parents
        binding.parentsImage.setOnClickListener(view1 -> {
            AddParentDialog();
        });

        //teachers
        binding.teachersImage.setOnClickListener(view1 -> {
            AddTutorDialog();
        });

        //messages
        binding.messagesImage.setOnClickListener(view1 -> {

        });

        //courses
        binding.coursesImage.setOnClickListener(view1 -> {
            AddClassDialog();
        });

        //logout
        binding.logoutLayout.setOnClickListener(view1 -> {
            LogoutDialog();
        });
    }

    private void AddStudentDialog(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.add_student_popup);

        dialog.findViewById(R.id.btnClose).setOnClickListener(view -> {
            dialog.dismiss();
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT)));
        dialog.show();
    }

    private void AddParentDialog(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.add_parent_popup);

        dialog.findViewById(R.id.btnClose).setOnClickListener(view -> {
            dialog.dismiss();
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT)));
        dialog.show();
    }

    private void AddTutorDialog(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.add_teacher_popup);

        dialog.findViewById(R.id.btnClose).setOnClickListener(view -> {
            dialog.dismiss();
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT)));
        dialog.show();
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

    private void LogoutDialog(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.logout_popup_);

        dialog.findViewById(R.id.stay_button).setOnClickListener(view -> {
            dialog.dismiss();
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT)));
        dialog.show();
    }



}