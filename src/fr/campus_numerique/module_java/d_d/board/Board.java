package fr.campus_numerique.module_java.d_d.board;

import fr.campus_numerique.module_java.d_d.factory.CreateNewBox;
import fr.campus_numerique.module_java.d_d.exception.PlayerOutException;
import fr.campus_numerique.module_java.d_d.menu.UserChoice;
import fr.campus_numerique.module_java.d_d.player.type.Enemy;
import fr.campus_numerique.module_java.d_d.player.type.Hero;

import java.util.*;

public class Board {
    private ArrayList<Box> board = new ArrayList<Box>();

    public Board() {

        int emptyCase = 64-4-10-10-5-4-5-2-6-2;

        HashMap<ItemType, Integer> array = new HashMap<ItemType, Integer>();
        array.put(ItemType.DRAGON, 4);
        array.put(ItemType.WIZARD, 10);
        array.put(ItemType.GOBLIN, 10);
        array.put(ItemType.MASS, 5);
        array.put(ItemType.SWORD, 4);
        array.put(ItemType.BOLT, 5);
        array.put(ItemType.FIREBALL, 2);
        array.put(ItemType.HEAL_POTION, 6);
        array.put(ItemType.GREATER_HEAL_POTION, 2);
        array.put(ItemType.EMPTY_BOX, emptyCase);


        for (int i = 1; i < 65; i++) {

            if (array.size() > 0) {

                ArrayList<ItemType> randomKeys = new ArrayList<ItemType>(array.keySet());
                ItemType key = randomKeys.get(new Random().nextInt(randomKeys.size()));

                boardValueUpdated(key, array);

            }
        }
    }

    private void boardValueUpdated(ItemType key, HashMap<ItemType, Integer> array) {
        this.board.add(CreateNewBox.createNewBox(key));
        int value = array.get(key) - 1;
        array.replace(key, value);
        if (value == 0) {
            array.remove(key);
        }
    }

    public void movePlayer(Hero hero, int dice) throws PlayerOutException {
        if (hero.getPos() + dice >= board.size()) {
            throw new PlayerOutException("Player is out");
        }
        hero.setPos(hero.getPos() + dice);
        board.get(hero.getPos()).interact(hero);
    }

    private void fightCase (Hero hero, Enemy enemy) {

    }

    public ArrayList<Box> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Box> board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + board +
                '}';
    }

}
