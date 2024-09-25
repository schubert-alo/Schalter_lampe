package org.schalter;

public class Schalter {
    private Lampe lampe;
    private boolean gedrueckt;

    public Schalter(Lampe lampe) {
        this.lampe = lampe;
    }

    public void drueckeSchalter() {
        gedrueckt = !gedrueckt;
        if(gedrueckt) {
            lampe.anschalten();
        } else {
            lampe.ausschalten();
        }
    }
}
