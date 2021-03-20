package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.tekmoment.classmomentschool.PopupClasses.AllPopups;
import com.tekmoment.classmomentschool.databinding.ActivityRegisterSchoolBinding;
import com.tekmoment.classmomentschool.databinding.ActivitySchoolDashboardBinding;

public class SchoolDashboardActivity extends AppCompatActivity {

    private ActivitySchoolDashboardBinding binding;

    private Dialog                         dialog;

    private AllPopups                      popups;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySchoolDashboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        popups = new AllPopups(this);

        //menu
        binding.menuImage.setOnClickListener(view12 -> {
            startActivity(new Intent(SchoolDashboardActivity.this, MenuActivity.class));
        });

        //view students
        binding.studentsLayout.setOnClickListener(view13 -> {
            startActivity(new Intent(SchoolDashboardActivity.this, AllStudentsActivity.class));
        });

        //students
        binding.studentsImage.setOnClickListener(view1 -> {
            AddStudentDialog();
        });

        //view parents
        binding.parentsLayout.setOnClickListener(view13 -> {
            startActivity(new Intent(SchoolDashboardActivity.this, AllParentsActivity.class));

        });

        //parents
        binding.parentsImage.setOnClickListener(view1 -> {
            AddParentDialog();
        });

        //view teachers
        binding.teachersLayout.setOnClickListener(view13 -> {
            startActivity(new Intent(SchoolDashboardActivity.this, AllTutorsActivity.class));
        });

        //teachers
        binding.teachersImage.setOnClickListener(view1 -> {
            AddTutorDialog();
        });


        //messages
        binding.messagesLayout.setOnClickListener(view1 -> {
            startActivity(new Intent(SchoolDashboardActivity.this, CirculateMessagesActivity.class));
        });

        //view courses
        binding.coursesLayout.setOnClickListener(view13 -> {
            startActivity(new Intent(SchoolDashboardActivity.this, AllClassesActivity.class));
        });

        //courses
        binding.coursesImage.setOnClickListener(view1 -> {
            AddClassDialog();
        });

        //logout
        binding.logoutLayout.setOnClickListener(view1 -> {
            popups.LogoutDialog();
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
}