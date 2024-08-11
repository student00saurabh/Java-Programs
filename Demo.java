class Calc
{
    public int add(int x,int y)
    {
        int result = x+y;
        return result;
    }
}
public class Demo{
    public static void main(String[] args) {
        Calc obj = new Calc();
        int x=5;
        int y=3;
        int result = obj.add(x,y);
        System.out.println(result);
    }
}
