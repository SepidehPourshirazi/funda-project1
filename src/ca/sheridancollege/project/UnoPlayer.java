/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sepidehpourshirazi
 */
class UnoPlayer extends Player {
    private List<UnoCard> hand;
    
    public UnoPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }
    
    public void drawCard(UnoDeck deck) {
        hand.add(deck.drawCard());
    }
    
    public void playCard(int index) {
        if (index >= 0 && index < hand.size()) {
            System.out.println(getName() + " played " + hand.get(index));
            hand.remove(index);
        } else {
            System.out.println("Invalid move!");
        }
    }
    
    public boolean hasWon() {
        return hand.isEmpty();
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}