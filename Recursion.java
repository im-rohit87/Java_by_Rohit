import java.util.Scanner;
public class Recursion {
    static int factorial(int n){
        //factorial(n) = n*n-1*....1
         if(n==0 || n==1){
            return 1;
         }
         else{
            return n *factorial(n-1);
         }
    }



         public static void main(String []args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Number you want to find the factorial of that number: ");
            int n = sc.nextInt();

            System.out.println("The factorial of the given number is: " + factorial(n));
         }
}

