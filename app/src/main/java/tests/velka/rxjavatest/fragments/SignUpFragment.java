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
import tests.velka.rxjavatest.presenters.SignUpPresenter;
import tests.velka.rxjavatest.views.SignUpView;

/**
 * Created by ekaterina on 5/10/17.
 */

public class SignUpFragment extends Fragment implements SignUpView{
    @BindView(R.id.registerButton) Button bRegister;
    @BindView(R.id.editName) EditText etName;
    @BindView(R.id.editEmail) EditText etEmail;
    @BindView(R.id.editPassword) EditText etPassword;
    @BindView(R.id.editConfirmPassword) EditText etConfirmPassword;
    private SignUpPresenter presenter = new SignUpPresenter();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sign_up_fragment, container, false);
        ButterKnife.bind(this, view);
        presenter.setSignUpView(this);
        bRegister.setOnClickListener(presenter::getRegisterListener);
        return view;
    }

    /**
     * TODO show hotel view
     */
    @Override
    public void register() {
        Toast.makeText(getActivity(), "Register button",
                Toast.LENGTH_LONG).show();
    }
}
