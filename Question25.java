package Questions;

public class Question25 {
    public static void main(String[] args) {
        animal a1 = new animal();
        a1.breath();
        fish f1 = new fish();
        f1.eat(5);
        f1.eat("sam");
        dog do1 = new dog();
        do1.run();
        do1.breath();
        dolfin d1 = new dolfin();
        d1.size();
        d1.eat(3,5);
        d1.swing();
        // yha par ham parent class me child ko coll kar sakte hai 
        // but child me prent ko nhi
        animal f2 = new fish();
        f2.eat(3);
        f2.breath();
    }
}
//single level inheritance
//parent class
class animal{
    String color;
    String eat;
    void eat( int a){
        System.out.println("eats");
    }
    //poly morphism same name ke kai fun. ho sakte hai 
    //lekin parameter alag alag hona chahiye
    //method over loading 
    void eat(int b, int c){
        System.out.println("lets eat");
    }
    void breath(){
        System.out.println("breaths");
    }

}
// hirarchial me ak hi parent class ki do ya jyada child class hoti hai
//child class
class fish extends animal{
     int fins;
     void swing(){
        System.out.println("swims");
     }
     void eat( int a){
        System.out.println("eats water");
    }
      void eat(String a){
        System.out.println(" eat food ");
    }
}
class dog extends animal{
    void run(){
        System.out.println("run faster");
    }
}
//multi lavel inheritance
//esme child ki child class banti hai
class dolfin  extends fish{
    int legs;
    void size(){
        System.out.println("large");
    }
}
// hybrid inheritance
// esme multilavel inheritance our herichal inheritance dono hote hai
