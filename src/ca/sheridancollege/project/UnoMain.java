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
public class UnoMain {
    public static void main(String[] args) {
        List<UnoPlayer> players = new ArrayList<>();
        players.add(new UnoPlayer("Alice"));
        players.add(new UnoPlayer("Bob"));
        players.add(new UnoPlayer("Charlie"));
        
        UnoGame game = new UnoGame("UNO Game", players);
        game.startGame();
    }
}