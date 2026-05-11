package com.example.scm2.service;

import com.example.scm2.entity.Contact;
import com.example.scm2.repository.Contactrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    //-----------------REPOSITORY INJECTED TO SERVICE---------------------------
    @Autowired
    private Contactrepository contactrepository;

    public ContactService(Contactrepository contactrepository)
    {
        this.contactrepository = contactrepository;
    }
//-----------------REPOSITORY INJECTED TO SERVICE---------------------------


    public String
    saveContact(Contact contact) {

//getEmail() not work when getter setter method are missing------------------------------------------------
        if (contact.getEmail() == null || contact.getEmail().isBlank()) {
            return "Email is required";
        }

        if (contactrepository.findByEmail(contact.getEmail()).isPresent()) {
            return "Email already exists";
        }

        contactrepository.save(contact);

        return "Contact Saved Successfully";
    }

    public long totalContacts()
    {
        return contactrepository.count();
    }
}