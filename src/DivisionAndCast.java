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


    System.out.println("Division result (double): " + divisionResult);


    int intResult = (int) divisionResult;


    System.out.println("Division result (integer after casting): " + intResult);
}

}

