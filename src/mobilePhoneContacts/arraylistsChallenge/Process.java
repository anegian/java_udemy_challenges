package mobilePhoneContacts.arraylistsChallenge;

import java.util.Scanner;

public class Process {
    private Scanner scanner = new Scanner(System.in);
    private MobilePhone mobilePhone = new MobilePhone("6977151810");

    public void runProcess(){
        startPhone();

        makeAContactList();

        printActions();

        boolean quit = false;
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
    private void startPhone(){
        System.out.println("Loading phone...");
    }
    private void makeAContactList(){

        Contact bob = new Contact("Bob", "31415926");
        Contact alice = new Contact("Alice", "16180339");
        Contact tom = new Contact("Tom", "11235813");
        Contact jane = new Contact("Jane", "23571113");

        this.mobilePhone.addNewContact(bob);
        this.mobilePhone.addNewContact(alice);
        this.mobilePhone.addNewContact(tom);
        this.mobilePhone.addNewContact(jane);
    }
    private void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone = " + phone);
        }else{
            System.out.println("Cannot add, " + name + " alredy on file");
        };
    }
    private void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);

        if(mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("Successfully updated record.");
        }else{
            System.out.println("Error updating record.");
        }
    }
    private void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }
    private void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhoneNumber() );
    }
    private void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contacts\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions\n");
        System.out.println("Choose your action: ");

    }

}
