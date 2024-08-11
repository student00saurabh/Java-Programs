package Questions;
public class Question27 {
    public static void printdec(int n) {
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        printdec(n-1);
    }
    public  static void assending(int n,int a){
        if(n==1){
            System.out.println(a);
            return ;
        }
        System.out.println(a-n+1);
        assending(n-1,a);
    }
    // logic ......
    public  static void assending1(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        assending1(n-1);
        System.out.println(n);
    }
    public static int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int sumoff(int n) {
        if(n==1){
            return 1;
        }
        return n+sumoff(n-1);
    }
    public static int fibonacci(int n) {
        if(n==1||n==0){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static boolean shortedarray(int arr[], int i){
        
        if(i ==arr.length - 1){
            return true;
        }
      if(arr[i]>arr[i+1]){
        return false;
      }
    
        return shortedarray(arr, i+1);
    }
    public static int firstacurence(int arr[], int i,int key){
        
        if(i ==arr.length){
            return -1;
        }
      if(arr[i]==key){
        return (i+1);
      }
    
        return firstacurence(arr, i+1, key);
    }

    public static int lastacurence(int arr[], int i,int key){
        
        if(i==0){
            return -1;
        }
      if(arr[i-1]==key){
        return (i);
      }
    
        return lastacurence(arr, i-1, key);
    }
    //same upar wala lekin doosre method se
    public static int lastocc(int arr[],int i,int key){
        if(i ==arr.length){
            return -1;
        }
      int found = lastocc(arr,i+1,key);
      if(found == -1 && arr[i] == key){
        return i;
      }
        return found;
    }
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
        return a*power(a,b-1);
    }
    public static void searchnum(int arr[],int i,int num){
        if(i == arr.length-1){
            return ;
        }
        if(arr[i]==num){
           System.out.println(arr[i]+" = "+i);
        }
        searchnum(arr, i+1,num);
    }
     public static void main(String[] args) {
        int n=10;
        int a=n;
        printdec(n);
        assending(n,a);
        assending1(n);
        System.out.println(factorial(n));
        System.out.println(sumoff(n));
        System.out.println(fibonacci(n));
        int arr[] = {13,23,4,8,4,6};
         System.out.println(shortedarray(arr, 0));
         System.out.println(firstacurence(arr,0,4));
         System.out.println(lastacurence(arr, arr.length, 4));
         System.out.println(lastocc(arr,0,4));
         System.out.println(power(2, 3));
         searchnum(arr, 0, 8);
     }
}