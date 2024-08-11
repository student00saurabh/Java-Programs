import java.util.Scanner;
public class Calculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter frist number ");
        int a=sc.nextInt();
        System.out.println("Enter second number ");
        int b=sc.nextInt();
        System.out.println("Enter an opperator ");
        char opp=sc.next().charAt(0);
        if(opp=='+')
        {
            int c=a+b;
            System.out.println(" Sum of a and b is = "+c);
        }
        else if(opp=='-')
        {
            int d=a-b;
            System.out.println("minuse is = "+d);
        }
        else if(opp=='*')
        {
            int multi=a*b;
            System.out.println("multiplication is = "+multi);
        }
        else if(opp=='/'){
            int div=a/b;
            System.out.println("devision is = "+div);
        }
        else if(opp=='%'){
            int mod=a%b;
            System.out.println(" modulous is = "+mod);
        }
        else 
        {
            System.out.println(" Enter a valid opperator ");
        }
        sc.close();
        
    }
    
}
