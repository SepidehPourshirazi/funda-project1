# UNO Game

## Overview
This project is a Java-based implementation of the popular card game **UNO**, developed using Object-Oriented Programming (OOP) principles. The game allows multiple players to take turns, play cards based on the game rules, and determine a winner.

## Features
- Supports multiple players
- Implements UNO card mechanics including **Skip, Reverse, Draw Two, Wild, and Wild Draw Four** cards
- Uses **OOP principles** such as encapsulation, inheritance, and polymorphism
- Deck shuffling and card dealing functionality
- Turn-based game logic with win condition detection

## Installation
1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Navigate to the project directory:
   ```bash
   cd uno-game
   ```
3. Compile the Java files:
   ```bash
   javac *.java
   ```
4. Run the game:
   ```bash
   java UnoMain
   ```

## How to Play
1. The game initializes with a shuffled deck and deals **7 cards** to each player.
2. Players take turns playing a card that **matches** the top card in color or number.
3. Special action cards affect the game flow:
   - **Skip**: Skips the next player's turn.
   - **Reverse**: Reverses the turn order.
   - **Draw Two**: Forces the next player to draw two cards.
   - **Wild**: Allows the player to choose a color.
   - **Wild Draw Four**: Forces the next player to draw four cards and allows color selection.
4. The first player to play all their cards **wins** the game!

## Authors
**Sepideh Pourshirazi**  

## License
This project is for educational purposes and is open for modifications and enhancements.

## Acknowledgments
Special thanks to **SYST 17796 (Fundamentals of Software Design and Development)** for the project guidelines and initial base code.

