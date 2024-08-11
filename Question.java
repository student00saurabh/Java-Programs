package Questions;
import java.util.*;

public class Question {
    public static void main(String[] args) {
        int arr[] = { 12,11,5,6,8,13};
        Arrays.sort(arr);
       // Arrays.sort(arr,Collections.reverseOrder();)
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
