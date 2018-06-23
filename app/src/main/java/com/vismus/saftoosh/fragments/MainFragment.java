package com.vismus.saftoosh.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.vismus.saftoosh.MainPagerAdapter;
import com.vismus.saftoosh.R;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {

    Context _context;

    ViewPager _vpgMain;
    ImageButton _btnNext;

    MainPagerAdapter _mainPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);
        _context = getContext();

        // find views
        _vpgMain = rootView.findViewById(R.id.vpg_main);
        _btnNext = rootView.findViewById(R.id.btn_next);

        // set adapters & listeners
        _mainPagerAdapter = new MainPagerAdapter(getActivity().getSupportFragmentManager());
        _vpgMain.setAdapter(_mainPagerAdapter);
        _btnNext.setOnClickListener(new OnNextButtonClickListener());

        setItems();
        return rootView;
    }

    void setItems(){
        List<Fragment> items = new ArrayList<>();
        // create & add items here
        _mainPagerAdapter.setItems(items);
        _mainPagerAdapter.notifyDataSetChanged();
    }

    class OnNextButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
            if(_mainPagerAdapter.getCount() == 0){
                return;
            }
            _vpgMain.setCurrentItem((_vpgMain.getCurrentItem() + 1) % _mainPagerAdapter.getCount(), false);
        }
    }
}
