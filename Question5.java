package Questions;

public class Question5 {

public static int buyandsell(int value[])
{
  int maxstock=0;
  int buystock=Integer.MAX_VALUE;
  for(int i=0;i<value.length;i++)
  {
    if(buystock<value[i])
    {
        int profit = value[i]-buystock;
        maxstock = Math.max(maxstock, profit);
    }
    else{
        buystock = value[i];
    }
  }
  System.out.println(maxstock);
  return 0;
}
    public static void main(String[] args) {
        int value[] = {4,1,3};
        buyandsell(value);
    }
    
}
