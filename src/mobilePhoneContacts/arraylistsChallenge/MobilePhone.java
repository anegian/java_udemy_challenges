package mobilePhoneContacts.arraylistsChallenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {

        this.myNumber = phoneNumber;
        this.myContacts= new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName())>=0) {
            System.out.println("Contact is already on file.");
            return false;
        }else {
            myContacts.add(contact);
            return true;
        }
    }
    public boolean updateContact(Contact oldContact, Contact newContact) {

        int oldContactIndex = findContact(oldContact);

        if (oldContactIndex>=0) {
            this.myContacts.set(oldContactIndex,newContact);
            System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
            return true;
        }else {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
    }
    public boolean removeContact(Contact contact){

        if (findContact(contact.getName())<0) {
            return false;
        }else {
            myContacts.remove(contact);
            return true;
        }
    }
    private int findContact(Contact contact){

        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName){

        for (int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }return -1;
    }
    public Contact queryContact(String name){

        if(findContact(name)>=0)
        return this.myContacts.get(findContact(name));

        return null;
    }
    public void printContacts() {
        System.out.println("Contact List");
        if (this.myContacts.size()>0) {
            System.out.println(this.myContacts.size() + " contacts.");
            for (int i = 0; i < this.myContacts.size(); i++) {
                System.out.println((i + 1) + "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
            }
        }else{
            System.out.println("No contacts so far.");
        }
    }
}
