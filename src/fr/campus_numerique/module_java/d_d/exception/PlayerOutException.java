package fr.campus_numerique.module_java.d_d.exception;

public class PlayerOutException extends Exception{

    String text;

    public PlayerOutException(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "PlayerOutException{" +
                "text='" + text + '\'' +
                '}';
    }
}
