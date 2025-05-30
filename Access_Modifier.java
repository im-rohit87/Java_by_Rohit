
    class Employee{
        private int id;
        private String name;

            public String getName(){
                return name;
            }
        public void setName(String n){
            name = n;
        }

        public void setId(int i){
            id = i;
        }

        public int getId(){
            return id;
        }
        
    }

public class Access_Modifier{
    public static void main(String [] args){
        Employee rohit = new Employee();
        //rohit.id = 452;
        //rohit.name = "Rohit";//Throws an  error due to private access

            rohit.setName("Rohit");
            System.out.println(rohit.getName());


    }
}