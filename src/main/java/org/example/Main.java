package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final int EXIT_TO_GAME = 2;
    private static int inputUser;

    public static void main(String[] args) {
        printUserMenu();
        inputUser = scanner.nextInt();
        validationInputData(inputUser);
        while (inputUser != EXIT_TO_GAME) {
            HangmanGame hangmanGame = new HangmanGame();
            hangmanGame.game();
            printUserMenu();
            inputUser = scanner.nextInt();
        }
    }

    private static void printUserMenu() {
        System.out.println("Выберите один из пунктов:");
        System.out.println("1 - Начать новую игру;");
        System.out.println("2 - Закрыть приложение.");
        System.out.println("Введите 1 или 2:");
    }

    private static void validationInputData(int inputUser) {
        if (inputUser <= 0 || inputUser >= 3) {
            System.out.println("Вы ввели неккоретконое значение. ");
            printUserMenu();
            inputUser = scanner.nextInt();
        }
    }
}

