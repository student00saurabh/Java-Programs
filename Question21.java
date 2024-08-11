package Questions;

public class Question21 {
    public static int setith(int n,int i){
        int m=1<<i;
        return n|m;
    }
    public static int clearith(int n, int i) {
        int m=~(1<<i);
        return n&m;
    }
    public static int  updateith(int n,int i, int j) {
        int num;
        if(j==0){
            num=clearith(n, i);
        }else if(j==1){
            num=setith(n, i);
        }
        return 1;
    }
    public static void range(int n){
        
    }

    public static void clearrang(int n, int i, int j){

    }
    public static void main(String[] args) {
        System.out.println(updateith(127, 02, 4));
    }
    
}
