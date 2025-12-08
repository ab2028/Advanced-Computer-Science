public class BobaShopTester {
    public static void main(String[] args) {





        BobaShopMember bob = new BobaShopMember("bob");

        BobaShopMember boba = new BobaShopMember("boba");
        // System.out.println(boba.equals(bob));

        BobaShop shop = new BobaShop("Boba Shop", 2);

        shop.registerMember(bob);
        shop.registerMember(boba);
        System.out.println(shop.toString());



        BobaShopMember n = new BobaShopMember("new");

        BobaShopMember[] mem = {bob, boba};

        BobaShop hi = new BobaShop("Shop", mem);
        System.out.println(hi.isFull());

        hi.registerMember(n);

        hi.increaseCapacity();
        System.out.println(hi.getRegisteredMembers().length);
        System.out.println(hi.isFull());
        System.out.println(hi.toString());

        hi.deleteMember(bob);
        System.out.println(hi.toString());



        // System.out.println(bob.loyaltyHistory());
        // System.out.println(bob.countLoyaltyCredits());

        // bob.grantLoyaltyCredit();
        // System.out.println(boba.equals(bob));
        // System.out.println(bob.loyaltyHistory());
        // System.out.println(bob.countLoyaltyCredits());

        // bob.grantLoyaltyCredit();
        // System.out.println("new" + bob.countLoyaltyCredits());
        // System.out.println(bob.determineMembershipStatus());
        // bob.grantLoyaltyCredit();
        // bob.grantLoyaltyCredit();
        // bob.grantLoyaltyCredit();
        // System.out.println(bob.countLoyaltyCredits());
        // System.out.println(bob.determineMembershipStatus());
        // bob.grantLoyaltyCredit();
        // bob.grantLoyaltyCredit();
        // bob.grantLoyaltyCredit();
        // System.out.println(bob.countLoyaltyCredits());
        // System.out.println(bob.determineMembershipStatus());



    }
}
