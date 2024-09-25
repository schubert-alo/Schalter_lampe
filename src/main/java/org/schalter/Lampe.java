package org.schalter;

public class Lampe {
    private boolean leuchtet;

    public void anschalten() {
        leuchtet = true;
        System.out.println("Lampe an.");
    }

    public void ausschalten() {
        leuchtet = false;
        System.out.println("Lampe aus.");
    }

    public boolean isLeuchtet() {
        return leuchtet;
    }

    public void setLeuchtet(boolean leuchtet) {
        this.leuchtet = leuchtet;
    }

}
