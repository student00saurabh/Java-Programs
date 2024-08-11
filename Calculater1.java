import java.util.Scanner;
public class Calculater1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter frist number ");
        int a=sc.nextInt();
        System.out.println("Enter second number ");
        int b=sc.nextInt();
        System.out.println("Enter an operator ");
        char opp=sc.next().charAt(0);
        switch(opp)
        {
            case '+':
            int sum=a+b;
            System.out.println("Sum of a and b is = "+sum);
            break;
            case '-':
            int min=a-b;
            System.out.println(" minuse of a and b is = "+min);
            break;
            case '*':
            int mul=a*b;
            System.out.println(" Multioplication is = "+mul);
            break;
            case '/':
            int div=a/b;
            System.out.println(" Devision is = "+div);
            break;
            case '%':
            int mod=a%b;
            System.out.println(" Modulous is = "+mod);
            break;
        }

        sc.close();
    }
}
