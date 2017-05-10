package tests.velka.rxjavatest.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import tests.velka.rxjavatest.R;
import tests.velka.rxjavatest.presenters.SignInPresenter;
import tests.velka.rxjavatest.views.SignInView;

/**
 * Created by ekaterina on 4/19/17.
 */

public class SignInFragment extends Fragment implements SignInView{
    @BindView(R.id.loginButton) Button bLogin;
    @BindView(R.id.emailEditText) EditText etEmail;
    @BindView(R.id.passwordEditText) EditText etPassword;
    private SignInPresenter presenter = new SignInPresenter();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sign_in_fragment, container, false);
        ButterKnife.bind(this, view);
        presenter.setSignInView(this);
        bLogin.setOnClickListener(presenter::getLoginListener);
        return view;
    }


    @Override
    public void login() {
        Toast.makeText(getActivity(), "Login button",
                Toast.LENGTH_LONG).show();
    }
}
