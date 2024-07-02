public class declaresaname  {

    public static void main(String[] args) {
        // Declare and assign values to two integer variables
        int x = 5;
        int y = 6;

        // Calculate y / x and assign it to a double variable q
        double q = (double) y / x;

        // Print out the result of y / x
        System.out.println("Initial q (y / x): " + q);

        // Cast y to a double and assign it to q
        q = (double) y;

        // Print out the updated value of q
        System.out.println("Updated q (cast y to double): " + q);
    }

}

