package com.rgl.infofilm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Mars on 12/3/2016.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int jumTab;

    public PagerAdapter(FragmentManager fm, int jt) {
        super(fm);
        jumTab = jt;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 : return new Fantastic();
            case 1 : return new Doctor();
            case 2 : return new Dont();
            case 3 : return new Bfg();
            case 4 : return new Jack();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return jumTab;
    }
}
