package tests.velka.rxjavatest.presenters;

import android.view.View;

import tests.velka.rxjavatest.views.SignUpView;

/**
 * Created by ekaterina on 4/19/17.
 */

public class SignUpPresenter {
    private SignUpView signUpView;

    public void getRegisterListener(View view){
        signUpView.register();
    }

    public void setSignUpView(SignUpView signUpView){
        this.signUpView = signUpView;
    }
}
