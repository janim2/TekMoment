package com.tekmoment.classmomentschool.Helpers;

import android.content.Context;
import android.content.SharedPreferences;

public class Functions {
    Context context;
    private static final String SP_NAME = "appStore";
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    public Functions(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(SP_NAME, 0);
    }

    /*
    SHARED PREFERENCES START HERE:
     */

    //Clear User Data
    public boolean clearStore(){
        editor = preferences.edit();
        editor.clear();
        return editor.commit();
    }

    //Put String Values Into Store
    public void put(String key, String value){
        editor = preferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    //Retrieve String Values From Store
    public String getString(String key){
        return preferences.getString(key, "");
    }

    //Put Boolean Values Into Store
    public void put(String key, boolean value){
        editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    //Retrieve Boolean Values From Store
    public boolean getBoolean(String key){
        return preferences.getBoolean(key, false);
    }
    /*
    SHARED PREFERENCES END HERE:
     */
}
