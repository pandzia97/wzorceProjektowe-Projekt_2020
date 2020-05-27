package com.company;

public class Main {

    public static void main(String[] args) {

        Ksiazka k = Ksiazka.builder("J.K.Rowling", "Harry Potter")
                .rokWydania(2000)
                .gatunek("fantastyka")
                .liczbaStron(50)
                .oprawaMiekka(false)
                .ksiazkaZniszczona(true)
                .naPolce(false)
    .build();

        System.out.println(k);

    }
}


