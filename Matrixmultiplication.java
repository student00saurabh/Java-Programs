import java.util.Scanner;
public class Matrixmultiplication {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int i,j,k;
   int  a[][]=new int[2][2]; 
   int b[][]=new int[2][2];
   int c[][]=new int[2][2];
   System.out.println(" Enter first matrix ");
   for(i=0;i<2;i++)
   {
     for(j=0;j<2;j++)
     {
        a[i][j]=sc.nextInt();
     }
   }
System.out.println(" Enter second matrix");
for(i=0;i<2;i++)
{
    for(j=0;j<2;j++)
    {
       b[i][j]=sc.nextInt(); 
    }
}
    System.out.println(" multiplication of entered matrices is ");
   for(i=0;i<2;i++)
   {
    for(j=0;j<2;j++)
    {
        c[i][j]=0;
        for(k=0;k<2;k++)
        {
c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
    }
   }
     for(i=0;i<2;i++)
   {
    for(j=0;j<2;j++)
    {
       System.out.print(c[i][j]+"\t");
        
    }
    System.out.println();
   }
}
}

