package Questions;

public class Questio11 {
    public static void spiralmatrix(int arr[][]) {
         int n=arr.length-1;
         int m= arr[0].length-1;
         int sr=0,sc=0;
    while(sr<=n && sc<=m)
    {
         for(int i=sr;i<=m;i++)
         {
            System.out.println(arr[sr][i]);
         }
         for(int i=sc+1;i<=n;i++)
         {
            System.out.println(arr[i][m]);
         }
         for(int i=m-1;i>=sc;i--)
         {
            if(sr==n)
            {
                break;
            }
            else{
               System.out.println(arr[n][i]);
            }
            

         }
         for(int i=n-1;i>=sr+1;i--)
         {
            System.out.println(arr[i][sc]);
         }
         sr++;
         sc++;
         m--;
         n--;
        }
    }
    public static void main(String[] args) {
       int  arr[][]={{1,2,3,4},{4,5,6,8},{7,8,9,5}};
       spiralmatrix(arr);
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

    }
    
}
