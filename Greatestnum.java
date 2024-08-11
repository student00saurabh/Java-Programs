import java.util.Scanner;
public class Greatestnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter frist number ");
        int a=sc.nextInt();
        System.out.println("Enter second number ");
        int b=sc.nextInt();
        System.out.println("Enter third number ");
        int c= sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Greatest number is a= "+a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("Greatest number is b= "+b);
        }
        else
        {
            System.out.println(" Greatest number is c= "+c);
        }
        sc.close();

    }
}
