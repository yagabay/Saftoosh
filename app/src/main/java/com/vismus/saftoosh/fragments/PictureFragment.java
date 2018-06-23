package com.vismus.saftoosh.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.vismus.saftoosh.R;
import com.vismus.saftoosh.Utils;

public class PictureFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_picture, container, false);
        ImageView imageView = rootView.findViewById(R.id.imv_picture);
        Bundle args = getArguments();
        String picFilePath = args.getString("PIC_FILE_PATH");
        imageView.setImageBitmap(Utils.readBitmapFromFile(getContext(), picFilePath));
        return rootView;
    }

}
