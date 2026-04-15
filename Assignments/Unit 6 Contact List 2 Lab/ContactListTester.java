
public class ContactListTester {
    public static void main(String[] args) {

        ContactList contactList = new ContactList();

        Contact contact1 = new Contact("John", "Doe", "1234567890");
        Contact contact2 = new Contact("Jane", "Smith", "0987654321");
        Contact contact3 = new Contact("Alice", "Johnson", "5555555555");
        Contact contact4 = new Contact("Bob", "Brown", "1111111111");

        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);

        System.out.println("Contacts after adding:");
        for (Contact c : contactList.getContactList()) {
            System.out.println(c);
        }

        System.out.println("\nSearching for 0987654321:");
        System.out.println(contactList.searchContacts("0987654321"));

        System.out.println("\nSorting by first name:");
        contactList.sortByFirstName();
        for (Contact c : contactList.getContactList()) {
            System.out.println(c);
        }

        System.out.println("\nSorting by last name:");
        contactList.sortByLastName();
        for (Contact c : contactList.getContactList()) {
            System.out.println(c);
        }

        System.out.println("\nSorting by telephone number:");
        contactList.sortByTelephoneNumber();
        for (Contact c : contactList.getContactList()) {
            System.out.println(c);

        }

        // test remove


        contactList.remove(contact1);
        for (Contact c : contactList.getContactList()) {
            System.out.println(c);
        }

        // test clear
        System.out.println("\nClearing the contact list:");
        contactList.clear();
        System.out.println("Size of contact list after clearing: " + contactList.size());


    }
}
