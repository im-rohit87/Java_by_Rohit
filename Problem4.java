public class Problem4{
    static void Pattern(int n){
        for(int i = n ; i>0; i--){
            for(int j = i;j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String args []){
        Pattern(4);
    }
}