package org.techtown.sharedpreferences

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class SettingFragment: PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences) //리소스에 접근하는 형식은 R.리소스디렉터리명.파일명 이다.
    }
}

