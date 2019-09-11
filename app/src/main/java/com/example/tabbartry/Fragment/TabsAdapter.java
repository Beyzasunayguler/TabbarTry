package com.example.tabbartry.Fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;

    public TabsAdapter(FragmentManager fm, int NoofTabs) {
        super(fm);
        this.numOfTabs = NoofTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentAdded added = new FragmentAdded();
                return added;
            case 1:
                FragmentMostRated mostRated = new FragmentMostRated();
                return mostRated;
            case 2:
                FragmentFavorites favorites = new FragmentFavorites();
                return favorites;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
