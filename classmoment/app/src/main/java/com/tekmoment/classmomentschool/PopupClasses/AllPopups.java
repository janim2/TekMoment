package com.tekmoment.classmomentschool.PopupClasses;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import com.tekmoment.classmomentschool.R;

public class AllPopups {
    Context context;
    Dialog  dialog;

    public AllPopups(Context context) {
        this.context = context;
    }

    public void LogoutDialog(){
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.logout_popup_);

        dialog.findViewById(R.id.stay_button).setOnClickListener(view -> {
            dialog.dismiss();
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT)));
        dialog.show();
    }
}
