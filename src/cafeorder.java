public class cafeorder {

    public static void main(String[] args) {
        // Declare variables for product prices
        double coffeePrice = 2.50;
        double cappuccinoPrice = 3.00;
        double espressoPrice = 2.00;

        // Create variables for order quantities
        int quantityCoffee = 3;
        int quantityCappuccino = 4;
        int quantityEspresso = 2;

        // Calculate subtotal
        double subtotal = (coffeePrice * quantityCoffee) +
                (cappuccinoPrice * quantityCappuccino) +
                (espressoPrice * quantityEspresso);

        // Define constant for sales tax
        final double SALES_TAX_RATE = 0.08; // 8% sales tax

        // Calculate total sale including sales tax
        double totalSale = subtotal * (1 + SALES_TAX_RATE);

        // Print the results formatted to two decimal places
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Total Sale (including %.2f%% sales tax): $%.2f%n", SALES_TAX_RATE * 100, totalSale);
    }

}

