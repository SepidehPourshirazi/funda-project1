/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author sepidehpourshirazi
 */
class UnoCard extends Card {
    public enum Color { RED, BLUE, GREEN, YELLOW, WILD }
    public enum Value { ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAW_TWO, WILD, WILD_DRAW_FOUR }
    
    private final Color color;
    private final Value value;
    
    public UnoCard(Color color, Value value) {
        this.color = color;
        this.value = value;
    }
    
    public Color getColor() {
        return color;
    }
    
    public Value getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return color + " " + value;
    }
}