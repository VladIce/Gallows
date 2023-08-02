package org.example;

public class Hangman {

    private void forLoop(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    public void defaultHangman() {
        String[] array = {
                "  +----+",
                "  |     ",
                "  |     ",
                "  |     ",
                "  |     ",
                "  |     ",
                "  |     ",
                "========="
        };

        forLoop(array);
    }

    public void firstMistake() {
        String[] array = {
                "  +----+",
                "  |    |",
                "  |    O ",
                "  |     ",
                "  |     ",
                "  |     ",
                "  |     ",
                "========="
        };

        forLoop(array);
    }

    public void twoMistake() {
        String[] array = {
                "  +----+",
                "  |    |",
                "  |    O",
                "  |    | ",
                "  |     ",
                "  |     ",
                "  |     ",
                "========="
        };

        forLoop(array);
    }

    public void threeMistake() {
        String[] array = {
                "  +----+",
                "  |    |",
                "  |    O",
                "  |   \\|/",
                "  |     ",
                "  |     ",
                "  |     ",
                "========="
        };

        forLoop(array);
    }

    public void fourMistake() {
        String[] array = {
                "  +----+",
                "  |    |",
                "  |    O",
                "  |   \\|/",
                "  |    | ",
                "  |     ",
                "  |     ",
                "========="
        };

        forLoop(array);
    }

    public void fiveMistake() {
        String[] array = {
                "  +----+",
                "  |    |",
                "  |    O",
                "  |   \\|/",
                "  |    | ",
                "  |   / \\",
                "  |     ",
                "========="
        };

        forLoop(array);
    }
}
