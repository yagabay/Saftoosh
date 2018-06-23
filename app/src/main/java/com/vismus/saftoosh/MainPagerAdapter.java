package com.vismus.saftoosh;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> _items;

    public MainPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
        _items = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return _items.size();
    }

    @Override
    public Fragment getItem(int position) {
        return _items.get(position);
    }

    public void setItems(List<Fragment> items){
        _items = items;
    }

}
