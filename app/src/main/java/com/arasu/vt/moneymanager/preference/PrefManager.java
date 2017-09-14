package com.arasu.vt.moneymanager.preference;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by kyros on 14-09-2017.
 */

public class PrefManager {
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context mContext;
    private  int PRIVATE_MODE=0;
    private static final String PREF_NAME="money_manager";
    private static final String IS_FIRST_TIME_LAUNCH="IsFirstTimeLaunch";
    public PrefManager(Context mContext){
        this.mContext=mContext;
        pref=mContext.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor=pref.edit();
    }
    public void setIsFirstTimeLaunch(boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime);
        editor.commit();
    }
    public boolean isFirstTimeLaunch(){
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH,true);
    }

}
