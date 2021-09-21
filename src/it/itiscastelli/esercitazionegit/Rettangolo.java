package it.itiscastelli.esercitazionegit;

public class Rettangolo {
    private Punto a, b, c, d;

    public Rettangolo(Punto a, Punto b, Punto c, Punto d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Punto getA() {
        return a;
    }

    public Punto getB() {
        return b;
    }

    public Punto getC() {
        return c;
    }

    public Punto getD() {
        return d;
    }

}
