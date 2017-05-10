package tests.velka.rxjavatest.views;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tests.velka.rxjavatest.R;
import tests.velka.rxjavatest.fragments.ButtonsFragment;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.activity_main_fragment, new ButtonsFragment())
                .commit();
    }
}
