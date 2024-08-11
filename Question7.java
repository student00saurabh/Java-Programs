package Questions;

public class Question7 {
    
    public static int selectionsort(int array[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(array[i]>array[j])
            {
              int  num = array[j];
               array[j] = array[i];
               array[i]=num;
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
        selectionsort(array, n);
        //Time Complexity = O(n^2)
    }
}
