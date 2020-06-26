package com.company;

public class PrettyPrinterAdapter extends PrettyPrinter {
    private Ksiazka ksiazka;
    public PrettyPrinterAdapter(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;

    }

    @Override
    public void print() {
        System.out.println(ksiazka.getAutor());
        System.out.println(ksiazka.getTytul());
        System.out.println(ksiazka.getGatunek());
        System.out.println(ksiazka.getLiczbaStron());
        System.out.println(ksiazka.getRokWydania());
        System.out.println(ksiazka.getWaga());

    }
}
