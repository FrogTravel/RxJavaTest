package tests.velka.rxjavatest.presenters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import tests.velka.rxjavatest.R;

/**
 * Created by ekaterina on 4/19/17.
 */

public class SignInPresenter extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buttons_fragment, container, false);
        ButterKnife.bind(this, view);

        return view;
    }
}
