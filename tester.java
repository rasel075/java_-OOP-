public class tester {

    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        s1.name ="Hasem";
        s1.id=30;
        s2.name="sonet";
        s2.id=40;
        System.out.println(s1.name+" "+s1.id);
        System.out.println(s2.name+" "+s2.id);

        s1=s2; // location s1=s2 hoye geche
        System.out.println();

        System.out.println(s1.name+" "+s1.id);
        System.out.println(s2.name+" "+s2.id);

        s1.name="Mr.perfect"; // s2.name same kortha , karon s2 er location s1 e chole geche
        System.out.println();

        System.out.println(s1.name+" "+s1.id);
        System.out.println(s2.name+" "+s2.id);
        
       
    }
}