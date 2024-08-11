import java.util.Scanner;

public class Name1 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a number  ");
        int n=sc.nextInt();
        String name[]=new String[n];
        System.out.println(" Enter name ");
        for(int i=0;i<n;i++)
        {
           name[i]=sc.nextLine();
        }
        System.out.println("Saurabh");

            for(int i=0;i<=n;i++)
            {
                 for(int j=1;j<=5;j++)
                 {
                   System.out.println(name[i]);
               }
             }
            sc.close();
    }

    
}
