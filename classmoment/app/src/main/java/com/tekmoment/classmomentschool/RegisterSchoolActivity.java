package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.tekmoment.classmomentschool.databinding.ActivityLoginBinding;
import com.tekmoment.classmomentschool.databinding.ActivityRegisterSchoolBinding;

public class RegisterSchoolActivity extends AppCompatActivity {

    private ActivityRegisterSchoolBinding binding;

    private Intent                        register_school_intent;

    private TextView                      user_type_text;

    private String                        user_type_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegisterSchoolBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.goBack.setOnClickListener(view1 -> {
            finish();
        });

        register_school_intent      = getIntent();

        user_type_string            = register_school_intent.getStringExtra("user_type");

        user_type_text              = binding.userTypeText;
        //making the text color mix mix
        Spannable wordtoSpan = new SpannableString("Welcome, " + user_type_string);
        wordtoSpan.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorAccent)), 0, 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        user_type_text.setText(wordtoSpan);

        binding.addSchoolButton.setOnClickListener(view12 -> {
//            Intent success_intent = new Intent(RegisterSchoolActivity.this, SuccessActivity.class);
//            success_intent.putExtra("success_type", "school_added");
//            startActivity(success_intent);
            Toast.makeText(RegisterSchoolActivity.this, "Coming soon", Toast.LENGTH_LONG).show();
        });
    }
}