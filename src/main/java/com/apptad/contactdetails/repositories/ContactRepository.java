package com.apptad.contactdetails.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apptad.contactdetails.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
