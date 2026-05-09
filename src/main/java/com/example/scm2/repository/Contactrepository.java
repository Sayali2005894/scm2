package com.example.scm2.repository;

import com.example.scm2.entity.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//crud repository se methods use kar sake hai
//book ka object handle karna hai jiski id integer hogi
public interface Contactrepository extends CrudRepository<Contact,Integer> {

    public Contact findById(int id);

    // Email search(in service layer check already exist or not)
    Optional<Contact> findByEmail(String email);
}

