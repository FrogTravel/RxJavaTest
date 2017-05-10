package tests.velka.rxjavatest.presenters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import tests.velka.rxjavatest.R;
import tests.velka.rxjavatest.views.SignInView;

/**
 * Created by ekaterina on 4/19/17.
 */

public class SignInPresenter {
    private SignInView signInView;

    public void getLoginListener(View view){
        signInView.login();
    }

    public void setSignInView(SignInView signInView){
        this.signInView = signInView;
    }

}
