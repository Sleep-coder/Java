import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the positive integer number");
        int num= scanner.nextInt();
        if (num < 0) {
            System.out.println("The number is not positive");
        } else {
            int result = factorial(num);
            System.out.println("The factorial of " + num + " is " + result);
        }
    }


    public static int factorial(int num){
        if (num>0){
            return num*factorial(num-1);
        }else{
            return 1;
        }
    }
}
