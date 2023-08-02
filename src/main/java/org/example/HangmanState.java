package org.example;

public class HangmanState {
    Hangman hangman = new Hangman();

    public void messageGameState() {
        System.out.println("Текущее состояние виселецы: ");
    }

    public void displayCurrentGameState(int counter) {
        switch (counter) {
            case 0:
                messageGameState();
                hangman.defaultHangman();
                break;
            case 1:
                messageGameState();
                hangman.firstMistake();
                break;
            case 2:
                messageGameState();
                hangman.twoMistake();
                break;
            case 3:
                messageGameState();
                hangman.threeMistake();
                break;
            case 4:
                messageGameState();
                hangman.fourMistake();
                break;
            case 5:
                messageGameState();
                hangman.fiveMistake();
                break;
        }
    }
}
