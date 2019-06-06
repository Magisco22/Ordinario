package com.uabc.database.example.examplejpa.components;

import com.uabc.database.example.examplejpa.entity.Contact;
import com.uabc.database.example.examplejpa.model.ContactModel;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component("contactConverter")
public class ContactConverter {
    public Contact convertToContactModel2Contact(ContactModel contactModel)  {
        Contact contact = new Contact();
        contact.setNombre(contactModel.getNombre());
        contact.setRaza(contactModel.getRaza());
        contact.setTipo(contactModel.getTipo());
        contact.setNacimiento(contactModel.getNacimiento());
        //String[] dates = contactModel.getNacimiento().split("T");
        //Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dates[0] + " " +dates[1]);
        //contact.setNacimiento(date);
        contact.setAdopcion(contactModel.getAdopcion());
        contact.setId(contactModel.getId());
        return contact;
    }

    public ContactModel convertContact2ContactModel(Contact contact){
        ContactModel contactModel = new ContactModel();
        contactModel.setNombre(contact.getNombre());
        contactModel.setRaza(contact.getRaza());
        contactModel.setTipo(contact.getTipo());
        contactModel.setNacimiento(contact.getNacimiento());
        //contactModel.setNacimiento(contact.getNacimiento().toString());
        contactModel.setAdopcion(contact.getAdopcion());
        contactModel.setId(contact.getId());
        return contactModel;
    }
}
