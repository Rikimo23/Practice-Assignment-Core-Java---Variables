public class cafeorder {

    public static void main(String[] args) {

        double coffeePrice = 2.50;
        double cappuccinoPrice = 3.00;
        double espressoPrice = 2.00;


        int quantityCoffee = 3;
        int quantityCappuccino = 4;
        int quantityEspresso = 2;

        double subtotal = (coffeePrice * quantityCoffee) +
                (cappuccinoPrice * quantityCappuccino) +
                (espressoPrice * quantityEspresso);


        final double SALES_TAX_RATE = 0.08;


        double totalSale = subtotal * (1 + SALES_TAX_RATE);

        
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Total Sale (including %.2f%% sales tax): $%.2f%n", SALES_TAX_RATE * 100, totalSale);
    }

}

