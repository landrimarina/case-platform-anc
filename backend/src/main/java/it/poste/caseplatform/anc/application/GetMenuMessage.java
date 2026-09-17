package it.poste.caseplatform.anc.application;

import it.poste.caseplatform.anc.domain.MenuMessage;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GetMenuMessage {

    public MenuMessage execute() {
        return new MenuMessage();
    }
}
