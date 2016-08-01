package com.example.emorais1375.tablayoutviewpager.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.emorais1375.tablayoutviewpager.fragments.FragmentA;
import com.example.emorais1375.tablayoutviewpager.fragments.FragmentB;
import com.example.emorais1375.tablayoutviewpager.fragments.FragmentC;

/**
 * Created by aluno on 01/08/2016.
 */
public class MyFragmentPageAdapter extends FragmentPagerAdapter {

    private String[] nTabTitles;

    public MyFragmentPageAdapter(FragmentManager fm, String[] nTabTitles) {
        super(fm);
        this.nTabTitles = nTabTitles;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FragmentA();
            case 1:
                return new FragmentB();
            case 2:
                return new FragmentC();
            default:
                return null;
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return this.nTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.nTabTitles[position];
    }
}
