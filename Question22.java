package Questions;

public class Question22 {
    public static void repitting(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
               System.out.println(arr[i]);
                i++;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={9,8,8,6,5,5,5,3,3,3,3,2,1};
        repitting(arr);
    }
}
