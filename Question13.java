package Questions;

public class Question13 {

     public static void searchnumber(int arr[][],int n,int m){
        int num=8;
        for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
             if(num== arr[i][j])
             {
                System.out.println(i+" "+j);
             }
           }
       }
       
    }
    public static void repeatnumber(int arr[][],int n,int m){
        int num= 2;
        int r=0;
        for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
             if(num== arr[i][j])
             {
                r=r+1;
             }
           }
       }
       System.out.println(r +" times");
       
    }


     public static void transposematrix(int arr[][],int n,int m){
         int array[][]=new int[n][m];
        for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
             array[j][i]=arr[i][j];
           }
       }

        for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
             System.out.print(array[i][j]);
           }
           System.out.println();
       }
       
    }

    public static boolean searchelement(int arr[][],int n,int m,int key) {
     int i=0;
     int j=n-1;
      while(i<n && j>=0)
      {
        if(arr[i][j] == key)
        {
          System.out.println(i+" "+j);
          return true;
        }
        if(arr[i][j]>key)
        {
          j--;
        }
        else{
          i++;
        }
       
      }
      return false;
      
    }
    public static void main(String[] args) {
        int  arr[][]={{1,2,3},{4,2,6},{2,8,9}};
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
        searchnumber(arr, n, m);
        repeatnumber(arr, n, m);
        transposematrix(arr, n, m);
        searchelement(arr, n, m, 9);

    }
}
