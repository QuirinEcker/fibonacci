import java.util.Scanner;

public class Ecker_Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int fibonacciNumber1 = 1;
        int fibonacciNumber2 = 1;
        int help;

        System.out.printf("Bis zu welchen Element: ");
        input = scanner.nextInt();

        if (input < 2){
            System.out.printf("f(  1 ): %7d \n"  , fibonacciNumber1);
        }
        else {

            System.out.printf("f(  1 ): %7d \n", fibonacciNumber1);
            System.out.printf("f(  2 ): %7d \n", fibonacciNumber2);

            for (int i = 3; i <= input; i++) {
                fibonacciNumber2 = fibonacciNumber1 + fibonacciNumber2;
                System.out.printf("f( %2d ): %7d \n", i, fibonacciNumber2);
                help = fibonacciNumber2;
                fibonacciNumber2 = fibonacciNumber1;
                fibonacciNumber1 = help;
            }
        }
    }
}
