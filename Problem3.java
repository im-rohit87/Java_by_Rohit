import java.util.Scanner;
public class Problem3{

    static int naturalnum(int n){
            if (n == 1){
                return 1;
            }
           return n + naturalnum(n-1);
    }




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int c = sc.nextInt();
        int x =naturalnum(c);
        System.out.println(x);
    }
}