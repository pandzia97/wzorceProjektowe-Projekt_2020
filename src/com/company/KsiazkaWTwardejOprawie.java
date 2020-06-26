package com.company;

public class KsiazkaWTwardejOprawie implements IKsiazka {

    private IKsiazka ksiazka;

    public KsiazkaWTwardejOprawie(IKsiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    @Override
    public double getWaga() {
        return ksiazka.getWaga()+0.3;

    }
}