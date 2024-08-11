import java.util.Scanner;
public class OddEven {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println(" Enter a number ");
     int num=sc.nextInt();
     int div=num%2;
     System.out.println((div==0)?"The number is even":"The number is odd");
     sc.close();
   } 
}
