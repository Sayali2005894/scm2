package com.example.scm2.controller;

import com.example.scm2.service.ContactService;
import org.springframework.stereotype.Controller;

@Controller
public class PageController {
//-----------------------SERVICE INJECTED--------------------------------------
  //variable declartion
    private final ContactService contactService;

    //constructor injection
    public PageController (ContactService contactService)
    {
        this.contactService=contactService;
    }
    //-----------------------SERVICE INJECTED--------------------------------------

}
