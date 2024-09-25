package org.schalter;

public class Main {
    public static void main(String[] args) {
        Lampe myLampe = new Lampe();
        Schalter mySchalter = new Schalter(myLampe);

        mySchalter.drueckeSchalter();
        mySchalter.drueckeSchalter();
    }
}