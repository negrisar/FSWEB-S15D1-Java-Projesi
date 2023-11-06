package grocery.models;
import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact (Contact newContact, Contact oldContact){
        if (myContacts.contains(oldContact)) {
            int index = myContacts.indexOf(oldContact);
            myContacts.set(index, newContact);
            System.out.println(oldContact.getName() + " güncellendi.");
            return true;
        } else {
            System.out.println(oldContact.getName() + " rehberde bulunamadı veya güncelleme yapılamadı.");
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(!myContacts.contains(contact)){
            return false;
        } else{
            myContacts.remove(contact);
            return true;
        }
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public void printContact() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + " ." + myContacts.get(i).getName() + " ->" + myContacts.get(i).getPhoneNumber());
        }
    }



}
