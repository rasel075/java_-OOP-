public class tester {

    public static void main(String[] args) {
        student s1=new student(); //object/instance1
        student s2=new student();/// Object / instance2
       s1.name=" Rasel";
       s1.id=75;
       s2.name= "Sonet";
       s2.id= 22;
       
       s1.showDetails();
       s2.showDetails();

       System.out.println();
       s1=s2;
       s1.showDetails();
       s2.showDetails();

       s1.standUp();

    
    }
}