package it.poste.caseplatform.anc.application;

import it.poste.caseplatform.anc.domain.HomePageMessage;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GetHomePageMessage {

    public HomePageMessage execute() {
        return new HomePageMessage();
    }
}
