package Questions;

public class Question6 {
    public static int bubbleshort(int array[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
            if(array[j]>array[j+1])
            {
              int  num = array[j+1];
               array[j+1] = array[j];
               array[j]=num;
            } 
          }
       }
       for(int i=0;i<n;i++)
       {
           System.out.println(array[i]);
       }
       
        return 0;
    }
    public static void main(String[] args) {
        int array[] = {4,5,2,3,1};
        int n=array.length;
        bubbleshort(array, n);
        //Time Complexity = O(n^2)
    }
}
