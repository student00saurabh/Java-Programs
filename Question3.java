package Questions;

public class Question3 {

    public static int waterTrapping(int height[],int n)
    {
        int leftmax[]= new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
            System.out.print(leftmax[i]);
        }
        System.out.println();
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--)
        {
            rightmax[j]=Math.max(rightmax[j+1],height[j]);
            System.out.print( rightmax[j]);
        }
        System.out.println();
        int trappedWater=0;
        for(int k=0;k<n;k++)
        {
          int waterlevel=Math.min(leftmax[k],rightmax[k]);
          trappedWater =trappedWater+(waterlevel-height[k]);
        }

        return trappedWater;
    }
    public static void main(String[] args) {
       int  height[]= {4,2,0,6,3,1,5};
        int n = height.length;
       System.out.println("Trapped Water height = "+waterTrapping(height,n));
    }
    
}
