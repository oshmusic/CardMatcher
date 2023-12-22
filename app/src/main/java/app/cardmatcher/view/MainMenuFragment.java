package app.cardmatcher.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.jetbrains.annotations.NonNls;

import app.carmatcher.databinding.MainmenufragmentBinding;

public class MainMenuFragment implements IMainMenuFragment{

    /**
     * Observer to be notified of events occurring in the fragment
     */
    private final Listener listener;

    /**
     * Gives access to the graphical elements of the fragment
     */
    private MainmenufragmentBinding binding;

    /**
     * Constructor for MainMenuFragments.
     * @param listener An observer to be notified of events.
     */
    public MainMenuFragment(Listener listener){
        this.listener = listener;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        this.binding = MainmenufragmentBinding.inflate(inflater);
        return this.binding.getRoot(); //return top level view
    }

    /**
     * Overrides method of same name from the superclass. Inflates the xml layout.
     * @param view The View returned by {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}
     * @param savedInstanceState If non-null, this fragment is being reconstructed from a previous
     * saved state as given here.
     */
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        //Todo: onClick() setup for the button
    }

}
