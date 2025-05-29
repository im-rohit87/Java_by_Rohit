public class Mrthod_overloading {

    static void foo(){
        System.out.println("Good morning brooo!");
     }


        static void foo(int a){
            System.out.println("Good morning "+ a + " brooo!");
        }

         static void foo(int a, int b){
            System.out.println("Good morning "+ a + " brooo!");
            System.out.println("Good morning "+ b + " brooo!");
        }


    static void change(int a){
        a = 98;
    }
    
        static void telljoke(){
            System.out.println("I invented a new world\n" + "Plagiarism");
        }

        static void change2(int[] arr){
            arr[0] = 98;
        }


     public static void main(String[] args) {
        //telljoke();
        //int [] marks = {52,48,465,48};
        //Case 1: Changing the Integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is -> " + x);

        // Case2: Changing the Array
        // int [] marks = {52,48,465,48};
        // change2(marks);
        // System.out.println(marks[0]);
        foo();
        foo(300,400);// Arguments are actual! 
     }
}
