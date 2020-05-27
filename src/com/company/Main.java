package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tytul: ");
        String a = scanner.nextLine();

        System.out.println("\nPodaj autora: ");
        String b = scanner.nextLine();

        System.out.println("\nPodaj rok wydania: ");
        int c = scanner.nextInt();

        System.out.println("\nPodaj gatunek: ");
        String d = scanner.next();

        System.out.println("\nPodaj liczbe stron: ");
        int e = scanner.nextInt();

        System.out.println("\nCzy oprawa ksiazki jest miekka? ");
        boolean f = scanner.nextBoolean();

        System.out.println("\nCzy ksiazka jest zniszczona? ");
        boolean g = scanner.nextBoolean();

        System.out.println("\nCzy ksiazka jest na polce? ");
        boolean h = scanner.nextBoolean();


        Ksiazka k = Ksiazka.builder(a, b)
                .rokWydania(c)
                .gatunek(d)
                .liczbaStron(e)
                .oprawaMiekka(f)
                .ksiazkaZniszczona(g)
                .naPolce(h)
                .build();

        System.out.println(k);
    }
}


