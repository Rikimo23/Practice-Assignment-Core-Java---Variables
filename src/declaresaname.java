public class declaresaname  {

    public static void main(String[] args) {

        int x = 5;
        int y = 6;


        double q = (double) y / x;


        System.out.println("Initial q (y / x): " + q);


        q = (double) y;


        System.out.println("Updated q (cast y to double): " + q);
    }

}

