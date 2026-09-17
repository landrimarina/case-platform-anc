package it.poste.caseplatform.anc.api;

import it.poste.caseplatform.anc.application.GetMenuMessage;
import it.poste.caseplatform.anc.domain.MenuMessage;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/anc/menu")
@Produces(MediaType.APPLICATION_JSON)
public class MenuMessageResource {

    private final GetMenuMessage getMenuMessage;

    @Inject
    public MenuMessageResource(GetMenuMessage getMenuMessage) {
        this.getMenuMessage = getMenuMessage;
    }

    @GET
    public MenuMessage getMenuMessage() {
        return getMenuMessage.execute();
    }
}
