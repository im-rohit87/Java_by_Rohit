public class Problem5{
    static int Fibo(int n){
        if(n == 1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
       else{
        return Fibo(n-1) + Fibo(n-2);
       }
    }


    public static void main(String args[]){

        int a = Fibo(5);
        System.out.println(a);
    }
}