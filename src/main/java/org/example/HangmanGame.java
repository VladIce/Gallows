package org.example;

import java.util.Scanner;

public class HangmanGame {
    HiddenWord hiddenWord = new HiddenWord();
    HangmanState hangmanState = new HangmanState();
    Scanner scanner = new Scanner(System.in);
    private final String THE_HIDDEN_WORD = hiddenWord.theHiddenWord();
    private String theHiddenMaskWord = maskWord(THE_HIDDEN_WORD);

    private int counter = 0;

    private final int COUNTER_IN_GAME_OVER = 5;

    public void game() {
        while (true) {
            displayGameInstructions();
            char inputUserChar = scanner.next().charAt(0);
            String intermediateHiddenMaskWordResult = theHiddenMaskWord;
            theHiddenMaskWord = checkLetter(THE_HIDDEN_WORD, theHiddenMaskWord, inputUserChar);
            letterNotFound(intermediateHiddenMaskWordResult);
            hangmanState.displayCurrentGameState(counter);
            if (isGameWin()) {
                messageGameWin();
                break;
            }
            if (isGameOver()) {
                messageGameOver();
                break;
            }
        }
    }

    public void displayGameInstructions() {
        System.out.println("Загадано слово из " + theHiddenMaskWord.length() +
                " букв. Ваша задача - разгадать это слово.");
        System.out.print("Количество оставшихся попыток: ");
        numberOfAttempts();
        System.out.println();
        System.out.println("Загаданное слово: " + theHiddenMaskWord);
        System.out.println("Введите букву:");

    }

    private void numberOfAttempts() {
        for (int i = COUNTER_IN_GAME_OVER; i > counter; i--) {
            System.out.print("+ ");
        }
    }

    public boolean isGameWin() {
        return THE_HIDDEN_WORD.equals(theHiddenMaskWord);
    }

    private void messageGameWin() {
        System.out.println("Было загадано слово " + THE_HIDDEN_WORD);
        System.out.println("Вы отгадали загаданное слово. Поздравляем!!!");
    }

    public boolean isGameOver() {
        return counter == COUNTER_IN_GAME_OVER;
    }

    public void messageGameOver() {
        System.out.println("Вы проиграли!");
    }

    private void letterNotFound(String intermediateHiddenMaskWordResult) {
        if (theHiddenMaskWord.equals(intermediateHiddenMaskWordResult)) {
            System.out.println("Такой буквы нет в загаданном слове");
            counter++;
        }
    }

    private String checkLetter(String theHiddenWord, String theHiddenMaskWord, char inputChar) {

        char[] wordChar = theHiddenWord.toCharArray();
        for (int i = 0; i < theHiddenWord.length(); i++) {
            if (wordChar[i] == inputChar) {
                theHiddenMaskWord = theHiddenMaskWord.substring(0, i) + inputChar
                        + theHiddenMaskWord.substring(i + 1);
            }
        }

        return theHiddenMaskWord;
    }

    private String maskWord(String theHiddenWord) {
        return theHiddenWord.replaceAll(".", "_");
    }
}

