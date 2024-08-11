import java.util.Scanner;
class Saurabh{
    public int add(int x,int y)
    {
      int sum =x+y;
      return sum;
    }
    
    public int min(int x, int y)
    {
        int substraction=x-y;
        return substraction;
    }
    public int mul(int x, int y)
    {
        int multiplication= x*y;
        return multiplication;
    }
    public int div(int x, int y)
    {
      int division =x/y;
      return division;
    }
}
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Saurabh obj=new Saurabh();
        System.out.println("Ente two numbers ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=obj.add(x,y);
        System.out.println(sum);
        int substraction=obj.min(x,y);
        System.out.println(substraction);
        int multiplication=obj.mul(x,y);
        System.out.println(multiplication);
        int division =obj.div(x,y);
        System.out.println(division);
        sc.close();
    }
}
