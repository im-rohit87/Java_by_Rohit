import java.util.Scanner;
public class Problem1{
    static void multiplication(int n){
        for(int i=1; i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of your Table which you want");
        int num = sc.nextInt();
         multiplication(num);
        }
    
}