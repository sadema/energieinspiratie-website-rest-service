package nl.energieinspiratie.website.websiterestservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@Slf4j
@RestController
public class FormController {

    @PostMapping(path = "/contact", consumes = "application/json")
    public ResponseEntity.BodyBuilder getContactFormData(@RequestBody ContactData contactData) {
        log.info("Naam: {}, Email: {}, Onderwerp: {}, Bericht: {}, Consent: {}",
                contactData.getName(),
                contactData.getEmail(),
                contactData.getSubject(),
                contactData.getMessage(),
                contactData.getConsent());
        return ResponseEntity.created(URI.create("https://energieinspiratie.nl/success"));
    }
}
