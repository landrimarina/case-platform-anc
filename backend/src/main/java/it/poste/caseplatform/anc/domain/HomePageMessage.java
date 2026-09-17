package it.poste.caseplatform.anc.domain;

public record HomePageMessage(String message) {
    public HomePageMessage() {
        this("Benvenuto nella piattaforma ANC. Qui puoi trovare tutte le informazioni necessarie per gestire i tuoi casi in modo efficiente.");
    }
}