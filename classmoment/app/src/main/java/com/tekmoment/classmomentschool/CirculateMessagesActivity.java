package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.tekmoment.classmomentschool.databinding.ActivityCirculateMessagesBinding;
import com.tekmoment.classmomentschool.databinding.ActivitySchoolDashboardBinding;

public class CirculateMessagesActivity extends AppCompatActivity {

    private ActivityCirculateMessagesBinding binding;

    private String[] user_type = {"Select Recipient", "All", "Tutors", "Parents"};

    private String  user_type_string = "";

    private Spinner user_type_spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_circulate_messages);
        binding = ActivityCirculateMessagesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        user_type_spinner = binding.selectUser;

        //usertype spinner
        user_type_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                user_type_string = user_type[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                user_type_string = "";
            }
        });
        ArrayAdapter<String> user_adapter = new ArrayAdapter<String>(this, R.layout.spinner_layout, user_type);
        user_type_spinner.setAdapter(user_adapter);

    }
}