public class Contact implements Comparable {
    private String firstName;
    private String lastName;
    private String telephoneNumber;


    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int compareTo(Object other) {
        if (other instanceof Contact) {
            Contact otherContact = (Contact) other;
            String details = this.firstName + " " + this.lastName + " " + this.telephoneNumber;
            String otherDetails = otherContact.firstName + " " + otherContact.lastName + " "
                    + otherContact.telephoneNumber;
            return details.compareTo(otherDetails);
        }
        return -1;

    }

    public int lastCompareTo(Object other) {
        if (other instanceof Contact) {
            Contact otherContact = (Contact) other;
            String details = this.lastName + " " + this.firstName + " " + this.telephoneNumber;
            String otherDetails = otherContact.lastName + " " + otherContact.firstName + " "
                    + otherContact.telephoneNumber;
            return details.compareTo(otherDetails);
        }
        return -1;

    }



    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Telephone: " + telephoneNumber;
    }

    public boolean isDuplicate(Contact other) {
        if (this.getTelephoneNumber().equals(other.getTelephoneNumber())) {
            return true;
        }
        return false;
    }



}

