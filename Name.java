import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n=sc.nextInt();
        n++;
        String name[]=new String[n];
        System.out.println(" Enter name ");
        for(int i=0;i<n;i++)
        {
           name[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.println(name[i]);
            }
        }
        sc.close();
    }
}
