package Questions;

import java.util.Arrays;

public class Question18 {
    public static String compres(String  str)
    {
        StringBuilder sb= new StringBuilder();
     for(int i=0;i<str.length();i++){
      Integer count  = 1;
      sb.append(str.charAt(i));
       while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
       {
          i++;
          count++;
       }
       if(count>1)
       {
        sb.append(count.toString());
       }
     }
     return sb.toString();
    }

    public static void anagram(String str1, String str2){
        if(str1.length()==str2.length()){
            char ch1[]=str1.toCharArray();
            char ch2[]=str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result= Arrays.equals(ch1,ch2);
           if(result){
            System.out.println(" is anagram");
           } else{
            System.out.println("not anagram");
           }
        }else{
            System.out.println("not anagram");
        }
    }
    public static void main(String[] args) {
       String str="aaaabbbcc";
       System.out.println(compres(str)); 
       String str1="race";
       String str2="care";
       System.out.println(str1.compareTo(str2));
       anagram(str1, str2);
       
    }
    
}
