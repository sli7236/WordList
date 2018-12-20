package com.company;

public class Main {

    public static void main(String[] args) {
        WordList animals = new WordList();
        animals.addWords("cat");
        animals.addWords("mouse");
        animals.addWords("frog");
        animals.addWords("dog");
        animals.addWords("dog");

        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        animals.removeWordsOfLength(4);
        System.out.println(animals.toString());
        animals.removeWordsOfLength(3);
        System.out.println(animals.toString());
        animals.removeWordsOfLength(2);
        System.out.println(animals.toString());
    }
}