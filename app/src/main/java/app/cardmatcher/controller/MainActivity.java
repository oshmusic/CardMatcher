package app.cardmatcher.controller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import app.cardmatcher.view.IMainView;
import app.cardmatcher.view.MainView;
import app.carmatcher.R;

public class MainActivity extends AppCompatActivity {

    /**
     * A reference to the main screen template
     */
    private IMainView mainView;

    /**
     * Called by Android whenever the activity is created.
     * @param savedInstanceState Saved data from prior implementation.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mainView = new MainView(this);
        this.setContentView(R.layout.main);
    }
}