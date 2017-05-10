package tests.velka.rxjavatest.presenters;

import android.view.View;

import tests.velka.rxjavatest.views.ButtonsView;

/**
 * Created by ekaterina on 4/19/17.
 */

public class ButtonsPresenter {
    private ButtonsView buttonsView;

    public void getSignInListener(View view){
        buttonsView.startSignIn();
    }

    public void getSignUpListener(View view){
        buttonsView.startSignUp();
    }

    public void setButtonsView(ButtonsView buttonsView) {
        this.buttonsView = buttonsView;
    }
}
