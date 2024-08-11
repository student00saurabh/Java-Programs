import java.util.Scanner;
public class Arrayave {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int num=sc.nextInt();
    int a[]=new int[num];
    int average=0;
     System.out.println(" Enter numbers ");
    for(int i=0;i<num;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<num;i++)
    {
        average=average+a[i];
    }
    double b=average/num; 
    System.out.println("average of numbers is "+b);
    sc.close();
   } 
}
