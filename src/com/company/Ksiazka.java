package com.company;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int rokWydania;
    private String gatunek;
    private int liczbaStron;
    private boolean oprawaMiekka;
    private boolean ksiazkaZniszczona;
    private boolean naPolce;

    public Ksiazka(String tytul, String autor, int rokWydania, String gatunek, int liczbaStron, boolean oprawaMiekka,
                   boolean ksiazkaZniszczona, boolean naPolce) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.gatunek = gatunek;
        this.liczbaStron = liczbaStron;
        this.oprawaMiekka = oprawaMiekka;
        this.ksiazkaZniszczona = ksiazkaZniszczona;
        this.naPolce = naPolce;
    }



    public static class Builder {
        private String tytul;
        private String autor;
        private int rokWydania = 1997;
        private String gatunek = "fantastyka";
        private int liczbaStron = 100;
        private boolean oprawaMiekka = true;
        private boolean ksiazkaZniszczona = false;
        private boolean naPolce = true;

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

        public Builder oprawaMiekka(boolean oprawaMiekka) {
            this.oprawaMiekka = oprawaMiekka;
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

        public Ksiazka build() {
            return new Ksiazka(tytul, autor, rokWydania, gatunek, liczbaStron, oprawaMiekka, ksiazkaZniszczona, naPolce );
        }
    }
    public static Builder builder(String autor, String tytul) {
        return new Builder(tytul, autor);
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", rokWydania=" + rokWydania +
                ", gatunek='" + gatunek + '\'' +
                ", liczbaStron=" + liczbaStron +
                ", oprawaMiekka=" + oprawaMiekka +
                ", ksiazkaZniszczona=" + ksiazkaZniszczona +
                ", naPolce=" + naPolce +
                '}';
    }
}
