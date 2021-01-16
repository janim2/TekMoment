package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tekmoment.classmomentschool.databinding.ActivityCategorySelectionBinding;
import com.tekmoment.classmomentschool.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding        binding;

    private TextView                    user_type_text, do_not_have_account_text;

    private String                      user_type_string;

    private Intent                      login_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.goBack.setOnClickListener(view1 -> {
            finish();
        });

        login_intent                = getIntent();

        user_type_string            = login_intent.getStringExtra("user_type");

        user_type_text              = binding.userTypeText;
        //making the text color mix mix
        Spannable wordtoSpan = new SpannableString("Welcome, " + user_type_string);
        wordtoSpan.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorAccent)), 0, 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        user_type_text.setText(wordtoSpan);

        do_not_have_account_text    = binding.doNotHaveAnAccount;
        //making the text color mix mix
        Spannable signupwordtoSpan = new SpannableString("Do not have an account? Sign Up");
        signupwordtoSpan.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorAccent)), 24, 31, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        do_not_have_account_text.setText(signupwordtoSpan);

        binding.doNotHaveAnAccount.setOnClickListener(view12 -> {
            if(user_type_string.equals("Admin")){
                Intent admin_ref = new Intent(LoginActivity.this, RegisterSchoolActivity.class);
                admin_ref.putExtra("user_type", user_type_string);
                startActivity(admin_ref);
            }
            else{
                Toast.makeText(LoginActivity.this, "Tutor screen not added yet", Toast.LENGTH_LONG).show();
            }
        });


    }
}