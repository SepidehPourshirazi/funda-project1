/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;

/**
 *
 * @author sepidehpourshirazi
 */
class UnoGame extends Game {
    private UnoDeck deck;
    private List<UnoPlayer> players;
    private UnoCard topCard;
    private int turnIndex;
    private boolean reverse;
    
    public UnoGame(String name, List<UnoPlayer> players) {
        super(name);
        this.players = players;
        this.deck = new UnoDeck(108);
        this.turnIndex = 0;
        this.reverse = false;
        dealCards();
    }
    
    private void dealCards() {
        for (UnoPlayer player : players) {
            for (int i = 0; i < 7; i++) {
                player.drawCard(deck);
            }
        }
        topCard = deck.drawCard();
        System.out.println("Starting Card: " + topCard);
    }
    
    public void playTurn() {
        UnoPlayer currentPlayer = players.get(turnIndex);
        System.out.println("It's " + currentPlayer.getName() + "'s turn");
        currentPlayer.playCard(0); // Placeholder for playing logic
        if (currentPlayer.hasWon()) {
            System.out.println(currentPlayer.getName() + " has won the game!");
        }
        nextTurn();
    }
    
    private void nextTurn() {
        if (reverse) {
            turnIndex = (turnIndex - 1 + players.size()) % players.size();
        } else {
            turnIndex = (turnIndex + 1) % players.size();
        }
    }
    
    public void startGame() {
        while (true) {
            playTurn();
            if (players.get(turnIndex).hasWon()) {
                break;
            }
        }
    }
    
    @Override
    public void play() {
        startGame();
    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}