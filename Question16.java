package Questions;

public class Question16 {
    public static int insertionsort(int array[])
    {
       for(int i=1;i<array.length;i++)
       {
        int current=array[i];
        int previous=i-1;
        while(previous>=0 && array[previous]>current)
        {
          array[previous+1]=array[previous];
          previous--;
        }
        array[previous+1]=current;
       }
       return 0;
    }
    public static void main(String[] args) {
        int array[]={10,12,9,4,19};
        insertionsort(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    
}
