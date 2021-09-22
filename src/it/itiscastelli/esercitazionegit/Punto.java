package it.itiscastelli.esercitazionegit;

public class Punto {
    private final double x;
    private final double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistanzaTraDuePunti(Punto punto) {
        return Math.sqrt(Math.pow(punto.getX()-this.getX(),2)+Math.pow(punto.getY()-this.getY(),2));
    }
}
