package com.linjy.mvpapplication.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.ref.WeakReference;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by linjy on 2017/12/11.
 */

public abstract class BaseFragment extends Fragment {
    private WeakReference<BaseActivity> mBaseActivityWeakReference;
    private Unbinder unbinder;

    public void attachBaseActivity(BaseActivity activity) {
        mBaseActivityWeakReference = new WeakReference<BaseActivity>(activity);
    }

    public BaseActivity getBaseActivity() {
        return mBaseActivityWeakReference.get();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof BaseActivity) {
            attachBaseActivity((BaseActivity) getActivity());
        } else {
            throw new IllegalArgumentException(getActivity().getClass().getName() + "is not subclass of BaseActivity");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @LayoutRes
    protected abstract int getLayoutId();
}
