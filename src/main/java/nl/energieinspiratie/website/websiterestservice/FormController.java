package nl.energieinspiratie.website.websiterestservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@Slf4j
@RestController
public class FormController {

    @PostMapping(path = "/contact", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public ResponseEntity<Void> getContactFormData(ContactData contactData) {
        log.info("Naam: {}, Email: {}, Onderwerp: {}, Bericht: {}, Consent: {}",
                contactData.getName(),
                contactData.getEmail(),
                contactData.getSubject(),
                contactData.getMessage(),
                contactData.getConsent());
        return ResponseEntity.status(HttpStatus.TEMPORARY_REDIRECT).location(URI.create("https://energieinspiratie.nl/success")).build();
    }
}
