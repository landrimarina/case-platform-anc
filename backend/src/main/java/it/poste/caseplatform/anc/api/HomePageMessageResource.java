package it.poste.caseplatform.anc.api;

import it.poste.caseplatform.anc.application.GetHomePageMessage;
import it.poste.caseplatform.anc.domain.HomePageMessage;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/anc/home")
@Produces(MediaType.APPLICATION_JSON)
public class HomePageMessageResource {

    private final GetHomePageMessage getHomePageMessage;

    @Inject
    public HomePageMessageResource(GetHomePageMessage getHomePageMessage) {
        this.getHomePageMessage = getHomePageMessage;
    }

    @GET
    public HomePageMessage getMessage() {
        return getHomePageMessage.execute();
    }
}
