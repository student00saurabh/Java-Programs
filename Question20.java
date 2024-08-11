package Questions;

public class Question20 {
    public static void onescompliment(int n){
        if((n & 1) == 0)
        {
            System.out.println(" number is Even ");
        }
        else{
            System.out.println("Number is Odd");
        }
    }

    public static int satith(int n,int i){
        int m=1<<i;
        return n|m;
    }
    public static int clearnum(int n,int i){
        int m=~(1<<i);
        return n & m;
    }
    public static void main(String[] args) {
        int n=7;
        onescompliment(n);
        System.out.println(satith(5,2));
        System.out.println(clearnum(7, 2));
    }
}
