package org.acme;

import io.quarkus.mailer.Mailer;
import io.quarkus.mailer.MailerName;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SomeService {
    @Inject
    Mailer defaultMailer;

    @Inject
    @MailerName("first")
    Mailer firstMailer;
}