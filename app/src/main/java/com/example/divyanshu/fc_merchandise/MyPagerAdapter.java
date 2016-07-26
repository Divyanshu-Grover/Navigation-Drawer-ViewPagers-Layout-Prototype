package com.example.divyanshu.fc_merchandise;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyPagerAdapter extends FragmentPagerAdapter{

    List<android.support.v4.app.Fragment> ClubList;

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0:
                return "ARSENAL";

            case 1:
                return "ATLETICO MADRID";

            case 2:
                return "BARCELONA";

            case 3:
                return "BAYERN MUNICH";

            case 4:
                return "CHELSEA";

            case 5:
                return "DORTMUND";

            case 6:
                return "JUVENTUS";

            case 7:
                return "LIVERPOOL";

            case 8:
                return "MANCITY";

            case 9:
                return "MANU";

            case 10:
                return "PSG";

            case 11:
                return "REAL MADRID";

            default:
                break;

        }
        return super.getPageTitle(position);
    }

    public MyPagerAdapter(android.support.v4.app.FragmentManager fm, List<android.support.v4.app.Fragment> ClubList) {
        super(fm);
        this.ClubList = ClubList;
    }

    public android.support.v4.app.Fragment getItem(int position){

        return ClubList.get(position);
    }

    public int getCount(){
        return ClubList.size();
    }
}