package app.cardmatcher.view;

public interface IMainMenuFragment {

    public interface Listener{
        /**
         * Called when the user clicks the button to start a 4x4 game
         */
        void onStartSixteenClicked();
    }
}
