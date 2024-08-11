import java.util.Scanner;

public class Newprograms {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener numbers ");
        int a[] = new int[10];

        for (i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (j = 0; j < 10; j++) {
            System.out.println(a[j]);
        }

        sc.close();
    }

}
