package org.schalter;

public class Ofen implements SchalterClient{
    private boolean heizt;

    public void anschalten() {
        heizt = true;
        System.out.println("Ofen an.");
    }

    public void ausschalten() {
        heizt = false;
        System.out.println("Ofen aus.");
    }
}
