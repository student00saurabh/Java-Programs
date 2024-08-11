package Questions;

public class Question2 {

    public static int Ques(int array[])
{
    int sum=0;
    for(int i=0;i<array.length;i++)
    {
        for(int j=i; j<array.length;j++)
        {
            for(int k=i;k<=j;k++)
            {
                sum = sum+array[k];
              System.out.print(array[k]);
            }
   
             System.out.print(" "+ sum);
             sum=0;
        }
        System.out.println();
    }
return 0;


} 
    public static void main(String[] args) 
    {

       int array[]={10,20,30,40,50};
       Ques(array);
    }
    
}
