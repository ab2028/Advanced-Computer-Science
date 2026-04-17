import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<Contact> contactList;

    // constructor
    // to-do: initializes an empty contact list
    public ContactList() {
        contactList = new ArrayList<Contact>();
    }

    // methods



    // to-do: findInsertLocation(String name)
    /**
     * returns the location in the contact list where the name should go to keep the list
     * alphabetized
     */

    private void checkNull(Contact contact) {
        if (contact == null || contact.getFirstName() == null || contact.getLastName() == null
                || contact.getTelephoneNumber() == null) {
            throw new IllegalArgumentException("One or more arguments is null");
        }
    }

    public boolean inList(Contact contact) {
        for (Contact c : contactList) {
            if (c.getTelephoneNumber().equals(contact.getTelephoneNumber())) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Contact contact) {
        checkNull(contact);

        if (!inList(contact)) {
            contactList.add(contact);
            return true;
        }
        return false;
    }


    public boolean remove(Contact contact) {
        checkNull(contact);

        if (inList(contact)) {
            contactList.remove(contact);
            return true;
        }
        return false;
    }

    // selection sort
    public void sortByFirstName() {
        for (int i = 0; i < contactList.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < contactList.size(); j++) {
                if (contactList.get(j).compareTo(contactList.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Contact temp = contactList.get(i);
            contactList.set(i, contactList.get(minIndex));
            contactList.set(minIndex, temp);

        }
    }

    // selection sort
    public void sortByLastName() {
        for (int i = 0; i < contactList.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < contactList.size(); j++) {
                if (contactList.get(j).lastCompareTo(contactList.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Contact temp = contactList.get(i);
            contactList.set(i, contactList.get(minIndex));
            contactList.set(minIndex, temp);

        }
    }

    // insertion sort
    public void sortByTelephoneNumber() {
        for (int i = 1; i < contactList.size(); i++) {
            // element to be inserted
            Contact key = contactList.get(i);

            int j = i - 1;

            // shift all elements greater than key to right
            while (j >= 0 && contactList.get(j).getTelephoneNumber()
                    .compareTo(key.getTelephoneNumber()) > 0) {
                contactList.set(j + 1, contactList.get(j));
                j--;
            }

            // place
            contactList.set(j + 1, key);
        }
    }

    public Contact searchContacts(String telephoneNumber) {
        for (Contact contact : contactList) {
            if (contact.getTelephoneNumber().equals(telephoneNumber)) {
                return contact;
            }
        }
        return null;
    }


    /** returns a String containing all of the words in list */
    @Override
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    @Override
    public Contact get(int index) {
        return contactList.get(index);
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    // to-do: size()
    /** returns the number of names in the contact list */
    @Override
    public int size() {
        return contactList.size();
    }

    // to-do: clear()
    /** removes all names from the contact list */
    @Override
    public void clear() {
        System.out.println("Clearing the contact list");
        for (int i = 0; i < contactList.size(); i++) {
            contactList.remove(i);
        }
    }

}
