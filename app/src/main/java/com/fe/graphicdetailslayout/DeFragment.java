package com.fe.graphicdetailslayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by chenpengfei on 2016/6/3.
 */
public class DeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_de, null);
        Glide.with(getActivity()).load(R.drawable.one).into((ImageView) contentView.findViewById(R.id.detail));
        return contentView;
    }
}
