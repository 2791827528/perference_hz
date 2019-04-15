package com.example.administrator.perference_hz;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import java.util.prefs.PreferencesFactory;
public class PrFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //onCreate方法保存Activity的状态
        addPreferencesFromResource(R.xml.perference);
        //调用XML文件perference
    }
}