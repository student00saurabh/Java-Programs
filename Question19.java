package Questions;

public class Question19 {
    public static int   decimaltobinary(int num){
        int b=0;
        int rem =0;
        while(num>0)
        {
            rem=num%2;
            b = b*10+rem;
           num= num/2; 
        }
        return b;
    }

    public static int   binarytodecimal(int num){
        int b=1;
        int a=0;
        while(num>1)
        {
           int rem=num%10;
            b = b*rem;
            a=a+b;
           num= num/10; 
        }
        return b;
    }
    public static void main(String[] args) {
        int num = 11110;
        System.out.println(binarytodecimal(num));
        System.out.println(5<<2);
         System.out.println(5>>2);
    }
}
