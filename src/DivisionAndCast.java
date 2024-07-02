public class DivisionAndCast {
    public static void main(String[] args) {
    // Declare and assign values to two double variables
    double num1 = 15.5;
    double num2 = 3.2;

    // Calculate the division of the larger number by the smaller number
    double divisionResult = 0.0;
    if (num1 >= num2) {
        divisionResult = num1 / num2;
    } else {
        divisionResult = num2 / num1;
    }

    // Print out the initial division result (as double)
    System.out.println("Division result (double): " + divisionResult);

    // Cast the division result to an integer
    int intResult = (int) divisionResult;

    // Print out the result after casting to an integer
    System.out.println("Division result (integer after casting): " + intResult);
}

}

