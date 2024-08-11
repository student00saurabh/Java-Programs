package Questions;
public class Question28 {
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
        int psqr = a*power(a,b/2);
        if(b%2!=0){
             psqr = a*psqr;
        }
        return psqr;
    }
    public static int power123(int a,int b){
        if(b==0){
            return 1;
        }
        int p = power123(a,b/2);
        int psqr = p*p;
        if(b%2 != 0){
             psqr = a*psqr;
        }
        return psqr;
    }
     public static int fullspace(int n ){
        if(n==0 || n ==1){
            return 1;
        }
        int totalway = fullspace(n-1)+fullspace(n-2);
        return totalway;
     }
     public static int fullspace123(int n ){
        if(n==0 || n ==1){
            return 1;
        }
        int totalway = fullspace123(n-1)+1;
        return totalway;
    }
  public static String removeduplicate(StringBuilder sb ,String str, boolean arr[], int index){
    if(index == str.length()){
        System.out.println(sb);
          return sb;
    }
    char ch = str.charAt(index);
    if(arr[ch-'a'] == true){
        removeduplicate(sb, str, arr, index+1);
    }else{
        arr[ch-'a'] = true;
        sb.append(ch);
        removeduplicate(sb, str, arr, index+1);
    }
    }
    public static void main(String[] args) {
        System.out.println(power(5, 4));
        System.out.println(power123(4,4));
        System.out.println(fullspace(3));
        System.out.println(fullspace123(3));
        String str = "Nammahshivay";
        System.out.println(removeduplicate(null, str, null, 0));
    }
}
