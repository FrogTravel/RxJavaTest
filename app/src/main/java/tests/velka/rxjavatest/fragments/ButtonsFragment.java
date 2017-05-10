package tests.velka.rxjavatest.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import tests.velka.rxjavatest.R;
import tests.velka.rxjavatest.presenters.ButtonsPresenter;
import tests.velka.rxjavatest.views.ButtonsView;

/**
 * Created by ekaterina on 4/19/17.
 */

public class ButtonsFragment extends Fragment implements ButtonsView {
    @BindView(R.id.sign_in_btn) Button signInBtn;
    @BindView(R.id.sign_up_btn) Button signUpBtn;
    private ButtonsPresenter presenter = new ButtonsPresenter();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buttons_fragment, container, false);
        ButterKnife.bind(this, view);
        presenter.setButtonsView(this);
        signInBtn.setOnClickListener(presenter::getSignInListener);
        signUpBtn.setOnClickListener(presenter::getSignUpListener);
        return view;
    }

    @Override
    public void startSignIn() {
        FragmentManager fragmentManager =  getActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.activity_main_fragment, new ButtonsFragment())
                .commit();
    }

    @Override
    public void startSignUp() {

    }
}
