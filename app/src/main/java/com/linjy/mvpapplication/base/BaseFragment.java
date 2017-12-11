package com.linjy.mvpapplication.base;

import android.content.Context;
import android.support.v4.app.Fragment;

import java.lang.ref.WeakReference;

/**
 * Created by linjy on 2017/12/11.
 */

public class BaseFragment extends Fragment {
    private WeakReference<BaseActivity> mBaseActivityWeakReference;

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
}
