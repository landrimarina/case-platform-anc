package it.poste.caseplatform.anc.domain;

public record MenuMessage(String message) {
    public MenuMessage() {
        this("Menù ANC in costruzione");
    }
}
