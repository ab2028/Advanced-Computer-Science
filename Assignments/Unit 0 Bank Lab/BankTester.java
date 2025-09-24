public class BankTester {
    public static void main(String[] args) {
        Bank bank1 = new Bank(3, 5);

        Bank bank2 = new Bank(4, 5); 

        System.out.println("Bank 1 has " + bank1.computeTotalEmployees() + " employees."); 

        bank2.setNumberOfLoanOfficers(3); 

        System.out.println("Bank 1 has " + bank1.getNumberOfTellers() + " tellers."); 

        System.out.println("Does Bank 1 equal Bank 2? " + bank1.equals(bank2)); 

        System.out.println(bank2); 

    }
}