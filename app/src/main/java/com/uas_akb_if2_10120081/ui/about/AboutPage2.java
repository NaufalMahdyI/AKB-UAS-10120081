/**
 * NIM : 10120081
 * NAMA : Naufal Mahdy
 * KELAS : IF-2
 */
package com.uas_akb_if2_10120081.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.uas_akb_if2_10120081.R;

public class AboutPage2 extends Fragment {


    public AboutPage2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_page2, container, false);
    }
}