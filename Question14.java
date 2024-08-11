package Questions;
import java.util.Scanner;
public class Question14 {
    public static boolean palindrom(String str) {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt((str.length())-1-i))
            {
                return false;
            }
            
        }
        return true;
        
    }
    public static String subarray(String str, int si,int en ) {
        String str4="";
        for(int i=si;i<=en;i++)
        {
            str4+=str.charAt(i);
        }
        return str4;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
        sc.close();
        System.out.println( palindrom(str));
       // String str1="madam";
        String str2="madam";
        //String str3=new String(original:"madam");
        System.out.println(subarray(str2, 1, 3));

    }
}
