import java.util.Scanner;
public class Primenumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int x=sc.nextInt();
        int j=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                j=1;
                break;
            }
        }
        if(j==1)
        {
            System.out.println(" number is composit");
        }
        else
        {
            System.out.println("Number is prime ");
        }
        sc.close();
    }
    
}
