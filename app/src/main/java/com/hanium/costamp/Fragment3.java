package com.hanium.costamp;

/**
 * Created by YEP on 2016-07-16.
 */
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


//메인화면에서 RANKING탭 Fragment
public class Fragment3 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment3, container, false);

        return view;
    }

}