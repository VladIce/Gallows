package org.example;

import java.util.Random;

public class HiddenWord {

    // TODO: а может сделать чтение из файла?! Нужно понять зачем и для чего.
    public String theHiddenWord() {
        Random random = new Random();
        String arrayWords[] = {
                "авиастроитель",
                "структура",
                "адмиралтейство",
                "технология",
                "аккумулятор",
                "каждодневность",
                "щеткодержатель"
        };
        return (arrayWords[random.nextInt(arrayWords.length)]);
    }
}
