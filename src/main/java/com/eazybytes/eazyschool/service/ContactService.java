package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService {
    public boolean saveContactDetails(Contact contact){
        log.info(contact.toString());
        return true;
    }
}
