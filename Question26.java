package Questions;

public class Question26 {
    public static void main(String[] args) {
       // animal a1 = new fish(); due abstract class we can not implement in this
        // fish1 f1 = new fish1();
        // f1.eat1();
        // f1.food();
        // f1.breath();
        btech b1 = new btech(5,7);// constructor channing 
        btech b2 = new btech(7);// constructor channing 
        b1.himanshu();
        home h1 = new home();
        h1.himanshu();
        student3 s1 = new student3();
       s1.mark = 56;
       System.out.println(s1.mark);
      s1.dolls();
    }
}
// abstract class animal{
//     void eat1(){
//         System.out.println("eats");
//     }
//     void food(){
//         System.out.println("Bread");
//     }
// }
// class fish1 extends animal{
//     void breath(){
//         System.out.println("breaths");
//     }
// }
interface student2{
    void himanshu();
}
class btech implements student2{
    public void  himanshu(){
        System.out.println("Student Saourabh");
    }
    btech(){
        System.out.println("Students abc");
    }
    btech(int a){
       this();
        System.out.println(6);
    }
    btech(int x, int b){
        this(3);
        System.out.println(5);
    }
}
class home implements student2{
    public void himanshu(){
        System.out.println("Agra");
    }
    home(){
        System.out.println("home");
    }
}

class student3{
    String name;
    static int mark = 89;
    static void dolls(){
        int price=10;
        String name;
        System.out.println("nothing");
    }
}
