public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = calculateSubtotal(items);
        String[] expensiveItems = listPremiumItems(items);
        int premiumCount = expensiveItems.length;

        // calculate tax and total
        double tax = calculateTax(subtotal, taxRate);
        double total = subtotal + tax;

        // log order details
        reportOrder(subtotal, tax, total, premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }


    public static double calculateSubtotal(Item[] items) {
        double subtotal = 0;
        for (Item item : items) {
            subtotal += calculateItemTotal(item);
            logItem(item);
        }
        return subtotal;
    }

    public static double calculateItemTotal(Item item) {
        return item.getPrice() * item.getQuantity();
    }

    // premium threshold may be changed
    public static boolean isPremium(Item item) {
        return item.getPrice() > 50.0;
    }

    // check if expensive or regular item
    public static void logItem(Item item) {
        if (isPremium(item)) {
            System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
        } else {
            System.out.println(item.getName() + " is a regular item at $" + item.getPrice());
        }
    }


    public static String[] listPremiumItems(Item[] items) {
        String[] expensiveItemsTemp = new String[items.length];
        int count = 0;

        for (Item item : items) {
            if (isPremium(item)) {
                expensiveItemsTemp[count++] = item.getName();
            }
        }
        return trimPremiumItems(expensiveItemsTemp, count);
    }

    public static String[] trimPremiumItems(String[] temp, int count) {
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }



    public static double calculateTax(double subtotal, double taxRate) {
        if (subtotal > 0) {
            return subtotal * taxRate;
        }
        return 0;
    }


    // report order
    public static void reportOrder(double subtotal, double tax, double total, int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);
    }

}
