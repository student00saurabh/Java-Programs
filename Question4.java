package Questions;

public class Question4 {
    public static int maxwater(int arr[],int n ) 
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            int left=arr[i];
            for(int j=0;j<n;j++)
            {
                left=Math.max(left,arr[j]);
            }
            int right=arr[i];
            for(int j=0;j<n;j++)
            {
                right=Math.max(right,arr[j]); 
            }
          res  = Math.min(left,right)-arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,3};
        int n=arr.length;
        System.out.println(maxwater(arr, n));
    }
    
}
