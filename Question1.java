package Questions;
public class Question1 {
     public static void update(int array[]){
    for(int i=0;i<array.length; i++)
    {
        array[i] = array[i]+1;
    }
  }
   
  public static int linearsearch(int key,int array[]){
    for(int i=0; i<array.length;i++)
    {
        if(array[i]==key)
        {
            return i;
        }
    }
    return -1;
  }
  
  public static int bineryseach(int key,int array[])
  {
int start=0; int end=array.length-1;

while(start<=end)
{
int mid=(start+end)/2;
    if(array[mid]==key){
        return mid;
    }
    else if(array[mid]<key)
    {
      start=mid+1;
    }
    else
    {
        end=mid-1;
    }
}
return -1;

  }

public static int selectnumber(int num,int x,int array2[])
{

  for(int i=0;i<array2.length;i++)
  {
    if(num==array2[i])
    {
       x=x+1;
    }
  }
  return x;
}

public static int reverseofarray(int array3[],int array2[] )
{
 for(int i=0; i<array2.length;i++)
 {
    for(int j=(array2.length-1);j>=0;j++)
    {
      array3[i]=array2[j];
    }
 }
 for(int i=0;i<array3.length;i++)
 {
 System.out.println(array3[i]);
 }
 return 0;
}
public static void main(String[] args){
  int  array[] = {10,20,30,40,50};
  System.out.println(linearsearch(20, array));
  System.out.println(bineryseach(40, array));

  int array2[]={10,10,20,20,30};
  System.out.println(selectnumber(20,0, array2));
  int array3[] = new int[array2.length];
  reverseofarray(array3, array2);

}
}
