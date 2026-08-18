public class cat {
    public String color;
    public String actoin="sitting"; //instance variable
    public int x =10;  // instance variabale
    public void m1(){
        int x=78; //Local variable
        System.out.print("Local: ");
        System.out.println(x); // Local variable print
        System.out.print("instance : ");
        System.out.println(this.x); // instance variable print

    }
    public void changeAction(String action){
        this.actoin=action; // instance variable change

    }
    public void details(){ // instance method
        System.out.println("color & action: "+color+" ~~ " +actoin);
    }

}
