public class Swapping {

    public static void f(int i, int n, int arr[]){
       
        if(i>=n/2){
            return;
        }
       int temp=  arr[i];
       arr[i]= arr[n-i-1];
       arr[n-i-1]=temp;
        f(i+1, n, arr);
    }

    public static void main(String[] args) {
      
        int arr[]= {2,3,4,5,6};
        int n= arr.length;
      
        f(0,n,arr);

         for(int i=0; i<= arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
