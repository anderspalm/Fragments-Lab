package com.ga.android.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

//    int mPageCount;

    private  PlaceholderFragment.OnListItemClickListener monListItemClickListener;

//    public SectionsPagerAdapter(FragmentManager fm, int pageCount) {
    public SectionsPagerAdapter(FragmentManager fm, PlaceholderFragment.OnListItemClickListener listener) {
//        super(fm);
//        mPageCount = pageCount;
        super(fm);
        monListItemClickListener = listener;
    }

    @Override
    public Fragment getItem(int position) {
//        switch (position){
//            //Complete this
//            default: return new PlaceholderFragment();
//        }
        return PlaceholderFragment.newInstance(position, monListItemClickListener);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
//        return mPageCount;
    return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            default:
            case 0:
                return "PICTURE";
            case 1:
                return "ABOUT ME";
            case 2:
                return "CONTACT";
        }

    }
}
