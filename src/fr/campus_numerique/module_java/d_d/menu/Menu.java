package fr.campus_numerique.module_java.d_d.menu;

import fr.campus_numerique.module_java.d_d.player.type.Hero;

import java.util.Objects;
import java.util.Scanner;


public class Menu {

    private Scanner keyboard = new Scanner(System.in);

    /**
     * function to return if the user want to do a game or exit
     *
     * @return String
     */
    // User menu for game start
    public UserChoice startMenu() {

        UserChoice response;
        do {
            System.out.println("Welcome to the game ! \n 1. START NEW GAME or 2. EXIT");
            switch (keyboard.nextLine()) {
                case "1" -> {
                    response = UserChoice.START;
                    System.out.println("Let's create a character");
                }

                case "2" -> {
                    response = UserChoice.END;
                    System.out.println("Ok bye, See ya");
                }
                default -> response = UserChoice.WRONG_ANSWER;
            };
        } while (response == UserChoice.WRONG_ANSWER);

        return response;
    }

    ;

    /**
     * function for type choosing by the user
     *
     * @return String
     */
    // User choose witch class
    public UserChoice chooseType() {
        UserChoice response;
        do {
            System.out.println("Choose your character: \n 1. WARRIOR or 2. MAGE");
            response = switch (keyboard.nextLine().toLowerCase()) {
                case "1" -> UserChoice.WARRIOR;
                case "2" -> UserChoice.MAGE;
                default -> UserChoice.WRONG_ANSWER;
            };
        } while (response == UserChoice.WRONG_ANSWER);
        return response;
    }

    /**
     * function for name choosing by the user
     *
     * @return String
     */
    // User choose his name
    public String chooseName() {
        String response;
        System.out.println("Choose your name:");
        response = keyboard.nextLine();
        return response;
    }

    /**
     * function to return if the user want to modify his char
     *
     * @param hero Player
     * @return String
     */
    // User have to confirm his choice or modify
    public UserChoice confirmChoiceMenu(Hero hero) {
        UserChoice response;
        do {
            System.out.println("Your choose is " + hero + "\n" + " Do you want to \n 1. CONFIRM or 2. MODIFY ?");
            response = switch (keyboard.nextLine()) {
                case "1" -> UserChoice.CONFIRM;
                case "2" -> UserChoice.MODIFY;
                default -> UserChoice.WRONG_ANSWER;
            };
        } while (response == UserChoice.WRONG_ANSWER);
        return response;
    }

    ;

    /**
     * function to return if the user want to do a new game or exit
     *
     * @return String
     */
    public UserChoice endGame() {
        UserChoice response;
        do {
            System.out.println("The game is over. Do you want to do another one ? \n 1. START or 2. END ?");
            response = switch (keyboard.nextLine()) {
                case "1" -> UserChoice.START;
                case "2" -> UserChoice.END;
                default -> UserChoice.WRONG_ANSWER;
            };
        } while (response == UserChoice.WRONG_ANSWER);
        return response;
    }

    public UserChoice newLap() {
        UserChoice response;
       if (Objects.equals(keyboard.nextLine(), "")) {
            response = UserChoice.CONTINUE;
        } else {
           response = UserChoice.WRONG_ANSWER;
       }
        return response;
    }


    ////////////////////////////

    public Scanner getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        this.keyboard = keyboard;
    }

}
