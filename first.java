package Questions;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num1 = sc.nextInt();
        for(int i=num1;i>=1;i--)
        {
            for(int j=num1;j>=i;j--)
            {
                System.out.print(j);
            }
            for(int j=(i+(i-3));j>=1;j--)
            {
                System.out.print(i);
            }
            for(int j=i;j<=num1;j++)
            {
                if(j!=1)
                {
                System.out.print(j);
                }
            }
            System.out.println();
        }

         for(int i=2;i<=num1;i++)
        {
            for(int j=num1;j>=i;j--)
            {
                System.out.print(j);
            }
            for(int j=1;j<=(i+(i-3));j++)
            {
                System.out.print(i);
            }
            for(int j=i;j<=num1;j++)
            {
                System.out.print(j);

            }
            System.out.println();
        }
        sc.close();
    }
}
