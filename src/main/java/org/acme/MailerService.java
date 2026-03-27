package org.acme;

import io.quarkus.mailer.Mailer;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/mailers")
public class MailerService  {
    @Inject
    @Any
    Instance<Mailer> mailers;

    @GET
    public String mailerResult() {
        return "Found mailers: %s".formatted(mailers.stream().count());
    }
}
