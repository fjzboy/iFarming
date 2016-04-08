package com.android.ifarm.ifarming.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.ifarm.ifarming.R;

import butterknife.Bind;
import butterknife.OnClick;

public class SarsFragment extends BaseFragment {

    public static SarsFragment newFragment() {
        SarsFragment fragment = new SarsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sars, container, false);
        bindView(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Bind(R.id.from)
    TextView mFrom;
    @Bind(R.id.type)
    TextView mType;
    @Bind(R.id.pinzhong)
    TextView mPz;
    @Bind(R.id.num)
    TextView mNum;
    @Bind(R.id.time)
    TextView mTime;
    @OnClick(R.id.read)
    void onRead() {

    }
    @OnClick(R.id.photo)
    void onPhoto() {

    }
    @OnClick(R.id.save)
    void onSave() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
    }
}
