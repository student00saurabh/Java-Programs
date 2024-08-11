package Questions;

public class Question9 {

    public static int countingsort(int arr[])
  {
    int num=0;
     for(int i=0;i<arr.length;i++)
        {
          if(num>arr[i])
          {
            num = arr[i];
          }
        }

        int count[]= new int[num+1];
        for(int i=0; i<arr.length;i++ )
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
       return 0; 
    }

    public static void main(String[] args) {
        
        int arr[] = {1,4,1,3,2,4,3,7};
        System.out.println(countingsort(arr));
}
}
