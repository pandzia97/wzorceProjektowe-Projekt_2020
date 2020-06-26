package com.company;

public class Ksiazka implements IKsiazka {
    private String tytul;
    private String autor;
    private int rokWydania;
    private String gatunek;
    private int liczbaStron;
    private boolean ksiazkaZniszczona;
    private boolean naPolce;
    private double waga;

    private Ksiazka(String tytul, String autor, int rokWydania, String gatunek, int liczbaStron, boolean oprawaMiekka,
                    boolean ksiazkaZniszczona, double waga) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.gatunek = gatunek;
        this.liczbaStron = liczbaStron;
        this.ksiazkaZniszczona = ksiazkaZniszczona;
        this.naPolce = naPolce;
        this.waga = waga;
    }


    public static class Builder {
        private String tytul;
        private String autor;
        private int rokWydania = 1997;
        private String gatunek = "fantastyka";
        private int liczbaStron = 100;
        private boolean ksiazkaZniszczona = false;
        private boolean naPolce = true;
        private double waga = 3.2;

        public Builder(String tytul, String autor) {
            this.tytul = tytul;
            this.autor = autor;
        }

        public Builder rokWydania(int rokWydania) {
            this.rokWydania = rokWydania;
            return this;
        }

        public Builder gatunek(String gatunek) {
            this.gatunek = gatunek;
            return this;
        }

        public Builder liczbaStron(int liczbaStron) {
            this.liczbaStron = liczbaStron;
            return this;
        }

        public Builder ksiazkaZniszczona(boolean ksiazkaZniszczona) {
            this.ksiazkaZniszczona = ksiazkaZniszczona;
            return this;
        }

        public Builder naPolce(boolean naPolce) {
            this.naPolce = naPolce;
            return this;
        }

        public Builder waga(double waga) {
            this.waga = waga;
            return this;
        }

        public Ksiazka build() {
            return new Ksiazka(tytul, autor, rokWydania, gatunek, liczbaStron, ksiazkaZniszczona, naPolce, waga);
        }
    }

    public static Builder builder(String autor, String tytul) {
        return new Builder(tytul, autor);
    }

    public String getTytul() {

        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public String getGatunek() {
        return gatunek;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }


    public boolean isKsiazkaZniszczona() {
        return ksiazkaZniszczona;
    }

    public boolean isNaPolce() {
        return naPolce;
    }

    public double getWaga() {
        return waga;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", rokWydania=" + rokWydania +
                ", gatunek='" + gatunek + '\'' +
                ", liczbaStron=" + liczbaStron +
                ", ksiazkaZniszczona=" + ksiazkaZniszczona +
                ", naPolce=" + naPolce +
                ", waga=" + waga +
                '}';
    }
}
