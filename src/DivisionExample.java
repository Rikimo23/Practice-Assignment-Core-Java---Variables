public class DivisionExample {

    public static void main(String[] args) {
        // Declare and assign integer values to two variables
        int num1 = 20;
        int num2 = 5;

        // Calculate the division of the larger number by the smaller number
        double result = 0.0;
        if (num1 >= num2) {
            result = (double) num1 / num2;
        } else {
            result = (double) num2 / num1;
        }

        // Print out the initial result
        System.out.println("Initial division result (integers): " + result);

        // Change the larger number to a decimal
        num1 = 20;
        double decimalNum2 = 5.0; // Changing num2 to a decimal

        // Recalculate the division with a decimal number
        result = num1 / decimalNum2; // No need for casting as num1 is already an int

        // Print out the updated result
        System.out.println("Updated division result (one number as decimal): " + result);
    }

}