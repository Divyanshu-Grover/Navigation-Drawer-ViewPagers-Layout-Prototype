package com.example.divyanshu.fc_merchandise;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Menu1_Fragment extends Fragment {

    List<Fragment> ClubList;
    MyPagerAdapter myPagerAdapter;
    FragmentManager fragmentManager;
    ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu1_, container, false);
        viewPager = (ViewPager)view.findViewById(R.id.Mypager);

        ClubList = new ArrayList<Fragment>();
        ClubList.add(new Arsenal());
        ClubList.add(new Atletico_Madrid());
        ClubList.add(new Barcelona());
        ClubList.add(new Bayernmunich());
        ClubList.add(new Chelsea());
        ClubList.add(new Dortmund());
        ClubList.add(new Juventus());
        ClubList.add(new Liverpool());
        ClubList.add(new Mancity());
        ClubList.add(new Manu());
        ClubList.add(new PSG());
        ClubList.add(new Realmadrid());


        fragmentManager = getFragmentManager();
        myPagerAdapter = new MyPagerAdapter(fragmentManager, ClubList);
        viewPager.setAdapter(myPagerAdapter);

        return view;
    }

}
