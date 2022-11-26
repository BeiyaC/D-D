package fr.campus_numerique.module_java.d_d.game;

import fr.campus_numerique.module_java.d_d.board.Board;
import fr.campus_numerique.module_java.d_d.exception.PlayerOutException;
import fr.campus_numerique.module_java.d_d.menu.Menu;
import fr.campus_numerique.module_java.d_d.menu.UserChoice;
import fr.campus_numerique.module_java.d_d.player.type.Hero;
import fr.campus_numerique.module_java.d_d.player.type.hero.Mage;
import fr.campus_numerique.module_java.d_d.player.type.hero.Warrior;

public class Game {

    Hero hero1;
    Board board;

    /**
     * function constructor for create a new menu and new player
     * it already
     */
    public void startGame() {

        Menu begining = new Menu();

        // Set up the game
        switch (begining.startMenu()) {
            case START -> {
                initiateGame(begining);
            }
            case END -> System.exit(0);

        }
    }

    /**
     * @param menu Menu
     */
    private void initiateGame(Menu menu) {

        UserChoice response;
        instantiatePlayerWithType(menu);
        do {
            response = menu.confirmChoiceMenu(hero1);
            System.out.println(hero1);
            continueOrModifyPerso(response, menu);
        }
        while (response.equals(UserChoice.MODIFY));
        board = new Board();
        forwardPlayer(hero1, board, menu);
    }

    /**
     * function to generate a dice
     *
     * @return int random
     */
    private int randomDice() {
        return (int) (Math.random() * 6 + 1);
    }


    /**
     * function to make forward the player and if the player is out it let the user choose if he wants to do another one or exit
     *
     * @param hero Player
     * @param board  Board
     * @param menu   Menu
     */
    private void forwardPlayer(Hero hero, Board board, Menu menu) {

        while (true) {
            if (menu.newLap() == UserChoice.CONTINUE) {
                int dice = randomDice();
                try {
                    board.movePlayer(hero, dice);
                    System.out.println("Your dice did: " + dice);
                    System.out.println("You are at the box nbr: " + hero.getPos());
                    System.out.println(hero);
                } catch (PlayerOutException text) {
                    System.out.println(text);
                    break;
                }

            }
        }

        switch (menu.endGame()) {
            case START -> this.startGame();
            case END -> System.exit(0);
        }


    }


    /**
     * function to let the user continue or modify his character
     *
     * @param response String
     * @param menu     Menu
     */
    private void continueOrModifyPerso(UserChoice response, Menu menu) {

        switch (response) {
            case CONFIRM -> {
                System.out.println("Let's start the game");
            }
            case MODIFY -> {
                instantiatePlayerWithType(menu);
            }
        }
    }

    /**
     * function to instantiate a new player with a specific type
     *
     * @param menu Menu
     */
    private void instantiatePlayerWithType(Menu menu) {

        switch (menu.chooseType()) {
            case WARRIOR -> this.hero1 = new Warrior(menu.chooseName());
            case MAGE -> this.hero1 = new Mage(menu.chooseName());
        }
    }


}
