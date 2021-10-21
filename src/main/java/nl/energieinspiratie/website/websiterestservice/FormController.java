package nl.energieinspiratie.website.websiterestservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class FormController {

    @PostMapping(path = "/contact", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public String getContactFormData(ContactData contactData) {
        log.info("Naam: {}, Email: {}, Onderwerp: {}, Bericht: {}, Consent: {}",
                contactData.getName(),
                contactData.getEmail(),
                contactData.getSubject(),
                contactData.getMessage(),
                contactData.getConsent());
        return "redirect:https://energieinspiratie.nl/success";
    }
}
