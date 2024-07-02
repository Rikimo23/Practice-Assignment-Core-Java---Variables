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


        System.out.println("Initial division result (integers): " + result);


        num1 = 20;
        double decimalNum2 = 5.0;


        result = num1 / decimalNum2;


        System.out.println("Updated division result (one number as decimal): " + result);
    }

}