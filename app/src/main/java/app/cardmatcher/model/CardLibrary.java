package app.cardmatcher.model;

import java.util.ArrayList;

/**
 * An object to hold all of the Card objects on a board. Size 16; further subclasses can extend this
 */
public class CardLibrary {

    private ArrayList<Card> library;

    public CardLibrary(){
        //TODO: Initialize card objects, add them to the list, and then shuffle the list
    }

    public ArrayList getLibrary(){
        return this.library;
    }
}
