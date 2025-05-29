public class varArgs{

    // static int sum(int a,int b){
    //     return a+b;
    // }
        static int sum(int...arr){
           //Available as  int []arr;
        
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;

    }

    public static void main(String [] args){
        System.out.println("Welcome to VarArgs Tutorial");
        System.out.println("The sum of 4 and 6 is " + sum(50,0));
        System.out.println("The sum of 45,50,54 and 6 is " + sum(45,50,54,6));
        System.out.println("The sum of 4 and 6 is " + sum(50,55,60,65,2,4,8,7));
        System.out.println("The sum of 4 and 6 is " + sum());
    }
}