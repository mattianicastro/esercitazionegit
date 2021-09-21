package it.itiscastelli.esercitazionegit;

public class Main {

    public static void main(String[] args) {
        Punto a, b, c, d;
        a = new Punto(2, 0);
        b = new Punto(8, 0);
        c = new Punto(8, 4);
        d = new Punto(2, 4);
        Rettangolo rettangolo = new Rettangolo(a,b,c,d);
    }
}
