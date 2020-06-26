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

        System.out.println("\nIle wazy ta ksiazka?");
        double i = scanner.nextDouble();


        //boulider
        Ksiazka k = Ksiazka.builder(a, b)
                .rokWydania(c)
                .gatunek(d)
                .liczbaStron(e)
                .ksiazkaZniszczona(g)
                .naPolce(h)
                .waga(i)
                .build();



        System.out.println(k);


        //dekorator
        IKsiazka ksiazka = new KsiazkaWTwardejOprawie(k);


        //adapter
        PrettyPrinterAdapter prettyPrinterAdapter = new PrettyPrinterAdapter(k);


    }
}


