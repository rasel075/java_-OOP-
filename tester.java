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
       
       System.out.println(" \n==Cat_class==\n ");

       cat c1=new cat();
       System.out.println("m1() call: ");
       c1.m1();
        c1.color="white";
        c1.details();
        c1.actoin="riding(not sitting) "; // instance varibale also change
        c1.details();
        
        cat c2=new cat();
        c2.color="Blue";
        c2.details();

        // changing 
        c1.changeAction("Riding... ");
        c1.details();
     
    }
}