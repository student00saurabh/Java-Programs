package Questions;

public class Question12 {
    public static void  diagonal(int arr[][],int n,int m) {
        int sum=0;
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
              if(i==j || (i+j) == n-1)
              {
                  sum= sum+arr[i][j];
              }
            }
        }
         System.out.println(sum);
    }
    public static void main(String[] args) {
        int  arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        diagonal(arr, n, m);
    }
    
}
