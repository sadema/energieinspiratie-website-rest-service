package nl.energieinspiratie.website.websiterestservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ContactData {

    private String name;

    private String email;

    private String subject;

    private String message;

    private Boolean consent;

}
