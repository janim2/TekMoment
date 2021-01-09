package com.tekmoment.classmomentschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tekmoment.classmomentschool.databinding.ActivityCategorySelectionBinding;

public class CategorySelectionActivity extends AppCompatActivity {

    private ActivityCategorySelectionBinding    binding;

    private TextView                            usertype_txt, user_txt_in_card, admin_txt_in_card;

    private CardView                            admincardview, tutorcardview;

    private String                              user_type = "Tutor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategorySelectionBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        usertype_txt        = binding.userTypeText;
        user_txt_in_card    = binding.tutorTxtInCard;
        admin_txt_in_card   = binding.adminTxtInCard;

        admincardview = binding.adminCardiew;
        admincardview.setOnClickListener(view1 -> {
            MakeCardSelected("Admin", admincardview, usertype_txt, admin_txt_in_card);
            MakeCardUnSelected(tutorcardview, user_txt_in_card);
            user_type = "Admin";

        });

        tutorcardview = binding.tutorCardview;
        tutorcardview.setOnClickListener(view12 -> {
            MakeCardSelected("Tutor", tutorcardview, usertype_txt, user_txt_in_card);
            MakeCardUnSelected(admincardview, admin_txt_in_card);
            user_type = "Tutor";
        });

        binding.continueButton.setOnClickListener(view13 -> {
            Intent gotologin = new Intent(CategorySelectionActivity.this, LoginActivity.class);
                gotologin.putExtra("user_type", user_type);
            startActivity(gotologin);
        });
    }

    private void MakeCardSelected(String type, CardView cardView, TextView usertype_txt, TextView txt_in_card){
        cardView.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
        usertype_txt.setText(type);
        txt_in_card.setTextColor(getResources().getColor(R.color.white));
    }

    private void MakeCardUnSelected(CardView cardView, TextView txt_in_card){
        cardView.setCardBackgroundColor(getResources().getColor(R.color.white));
        txt_in_card.setTextColor(getResources().getColor(R.color.colorPrimary));
    }
}