package Questions;

public class Question8 {

    public static int insertionsort(int arr[])
    {
       for(int i=1;i<arr.length; i++)
       {
        int curr = arr[i];
        int prev = i-1;
        while(prev>=0 && arr[prev]>curr)
        {
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = curr;
       } 
        return 0;
    }
    public static void main(String[] args) {
      int arr[]= {12,11,13,6,5};
      insertionsort(arr);
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
    }
}
