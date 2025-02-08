/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sepidehpourshirazi
 */
class UnoDeck extends GroupOfCards {
    private List<UnoCard> deck;
    
    public UnoDeck(int numCards) {
        super(numCards);
        deck = new ArrayList<>();
        for (UnoCard.Color color : UnoCard.Color.values()) {
            if (color != UnoCard.Color.WILD) {
                for (UnoCard.Value value : UnoCard.Value.values()) {
                    if (value != UnoCard.Value.WILD && value != UnoCard.Value.WILD_DRAW_FOUR) {
                        deck.add(new UnoCard(color, value));
                        if (value != UnoCard.Value.ZERO) {
                            deck.add(new UnoCard(color, value)); // Two of each (except 0)
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            deck.add(new UnoCard(UnoCard.Color.WILD, UnoCard.Value.WILD));
            deck.add(new UnoCard(UnoCard.Color.WILD, UnoCard.Value.WILD_DRAW_FOUR));
        }
        Collections.shuffle(deck);
    }
    
    public UnoCard drawCard() {
        return deck.remove(0);
    }
    
    @Override
    public int getSize() {
        return deck.size();
    }
}