public class Patern {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
            if(i==1||j==1||i==10||j==10){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}
