import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int x=sc.nextInt();
        long fact=1;
        for(int i=1;i<=x;i++){
         fact=fact*i;
        }
        System.out.println("Factorial is = "+fact);
        sc.close();
    }
    
}
