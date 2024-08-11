package Questions;

interface Car
{
    void drive();
}
public class AnnonymousInnerClass {
    public static void main(String[] args) {
        Car obj = new Car()
        {
            public void drive()
            {
                System.out.println("Drive........ ");
            }
        };
        obj.drive();
    }
}
