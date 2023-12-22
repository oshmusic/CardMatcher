package app.cardmatcher.view;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import app.cardmatcher.controller.MainActivity;
import app.carmatcher.databinding.MainBinding;

public class MainView implements IMainView {

    /**
     * Object to perform fragment transactions
     */
    FragmentManager fmanager;
    /**
     * Gives access to graphical elements in the xml layout for the main screen
     */
    MainBinding binding;

    /**
     * Constructor method
     * @param activity The Android activity the screen is associated with.
     */
    public MainView(FragmentActivity activity){
        this.fmanager = activity.getSupportFragmentManager();
        this.binding = MainBinding.inflate(activity.getLayoutInflater());
    }

    /**
     * Retrieves the graphical widget (Android view) at the root of the layout hierarchy.
     * @return The screen's root view/widget
     */
    @Override
    public View getRootView(){
        return this.binding.getRoot();
    }

    /**
     * Replaces the contents of the screen's fragment container with the fragment passed in as an argument.
     * @param fragment The fragment to be displayed
     * @param reversible True if the fragment should be reversible, false otherwise
     * @param name A name to be attached to this transaction
     */
    @Override
    public void displayFragment(Fragment fragment, boolean reversible, String name){
        FragmentTransaction ft = fmanager.beginTransaction()
                .replace(this.binding.fragmentContainerView.getId(), fragment);
        if(reversible){
            ft.addToBackStack(name);
        }
        ft.commit();
    }
}
