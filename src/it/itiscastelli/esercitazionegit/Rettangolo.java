package it.itiscastelli.esercitazionegit;



public class Rettangolo {
    private Punto a, b, c, d;

    private class PuntiNonValidi extends Error {
        public PuntiNonValidi(String errorMessage) {
            super(errorMessage);
        }
    }

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

    public double getLunghezzaLato(Punto a, Punto b) {
        if(a.getX()!=b.getX() && a.getY()!=b.getY()){
            throw new PuntiNonValidi("I punti passati non sono validi");
        }
        return a.getDistanzaTraDuePunti(b);
    }

    public double getArea() {
        final double ab = a.getDistanzaTraDuePunti(b);
        final double bc = b.getDistanzaTraDuePunti(c);
        return ab*bc;
    }
}
