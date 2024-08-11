import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Two numbers ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=(a+b);
            System.out.println("sum is= "+sum);
        }
    }
}
