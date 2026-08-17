public class tester {

    public static void main(String[] args) {
        student s1=new student(); //object/instance1
        student s2=new student();/// Object / instance2
       s1.name=" Rasel";
       s1.id=75;
       s2.name= "Sonet";
       s2.id= 22;
       house h1=new house();
       house h2=new house();
       h1.window=5;
       h1.door=2;
       h2.window=9;
       h2.door=10;
System.out.println("h1... ");
       h1.view();
       System.out.println("h2... ");
       h2.view();
           System.out.println("add door 2 than h1... ");   

       h1.increaseDoor(2);
       
       h1.view();

       System.out.println("add door =5 than h2... "); 

        h2.increaseDoor(5);
       h2.view();
       

    
    }
}