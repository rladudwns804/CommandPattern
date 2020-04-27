package com.example.sharingapp;
import android.content.Context;
import java.util.ArrayList;

public class AddContactCommand extends Command{
    private ContactList contactList;
    private Contact contact;
    private Context context;

    public AddContactCommand(ContactList contactList, Contact contact, Context context){
        this.contactList = contactList;
        this. contact = contact;
        this.context = context;
    }

    public void execute(){
        contactList.addContact(contact);
        setIsExecuted(ContactList.saveContacts(context));
    }

}