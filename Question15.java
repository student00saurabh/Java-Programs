package Questions;

public class Question15 {
    public static float shortestpath(String str) {
       int x=0;
       int y=0;
       for(int i=0;i<str.length();i++)
       {
        if(str.charAt(i)=='w')
        {
           x--;
        }
        else if(str.charAt(i)=='e')
        {
         x++;
        }
        else if(str.charAt(i)=='n')
        {
           y++; 
        }
        else if(str.charAt(i)=='s')
        {
           y--; 
        }
       } 
       x=x*x;
       y=y*y;
        float sortdist=(float)Math.sqrt(x+y);
        return sortdist;
    }

    public static String shortestString(String str1[]) {
        String largest =str1[0];
        for(int i=1;i<str1.length;i++)
        {
           if(largest.compareTo(str1[i])<0)
           {
             largest=str1[i];
           }
        }
        return largest;
    }
    public static void main(String[] args) {
        String str="wsenwnsew";
        System.out.println(shortestpath(str));
        String str1[]={"mango","apple","banana"};
        System.out.println(shortestString(str1));
    }
    
}
