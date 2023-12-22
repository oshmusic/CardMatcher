package app.cardmatcher.view;

import android.view.View;

import androidx.fragment.app.Fragment;

public interface IMainView {
    /**
     * Gets the graphical widget (Android view) at the root of the screen hierarchy.
     * @return The screen's root widget (Android view)
     */
    View getRootView();

    /**
     * Replaces the contents of the screen's fragment container with the fragment passed in
     * as an argument.
     * @param fragment The fragment to be displayed
     * @param reversible True if the fragment should be reversible, false otherwise
     * @param name A name to be attached to this transaction
     */

    void displayFragment(Fragment fragment, boolean reversible, String name);
}
