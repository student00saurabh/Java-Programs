import java.util.Scanner;
public class Searching {
  public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
     
      int i,search,x=0; 
      int array[]=new int [5];
      System.out.println("Enter numbers ");
      for(i=0;i<5;i++){
          array[i]=sc.nextInt();
      }
      System.out.println("Enter search number");
      search=sc.nextInt();
      
      for(i=0;i<5;i++)
      {
          if(array[i]==search)
          {
              System.out.println(" Number found at "+(i+1));
              x=1;
              break;
          }
      }
    if(x==0)
    {
       System.out.println("number is not found "); 
    }
    sc.close();
  }
  
  } 


