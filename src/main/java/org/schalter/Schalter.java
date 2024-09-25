package org.schalter;

public class Schalter {
    private SchalterClient client;
    private boolean gedrueckt;

    public Schalter(SchalterClient client) {
        this.client = client;
    }

    public void drueckeSchalter() {
        gedrueckt = !gedrueckt;
        if(gedrueckt) {
            client.anschalten();
        } else {
            client.ausschalten();
        }
    }
}
