package Questions;

public class Question23 {
    public static void main(String[] args) {
       pen p1 = new pen();
       p1.setcolor("red");
       System.out.println(p1.color);
       p1.setprice(5);
       System.out.println(p1.price);
       pen p2=new pen();
       System.out.println(p2.getcolor());

    }
}
class pen{
    String color;
    int price;
    int tip;
    void setcolor(String setcolor){
        color = setcolor;
    }
    void setprice(int setprice){
        price = setprice;
    }
    void settip(int settip){
        tip  = settip;
    }
    String getcolor(){
       return this.color;
    }
    int getprice(){
        return this.price;
    }
}
