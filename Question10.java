package Questions;
import java.util.Scanner;

//public static spiralmatrix(int arr[])

public class Question10 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int arr[][] = new int[3][3];
       System.out.println("Enter an 2D array ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
              arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
