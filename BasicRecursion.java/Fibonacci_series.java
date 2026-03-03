public class Fibonacci_series {
    static int fibo(int n){

        // Base condition
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        } else
            return fibo(n-1)+fibo(n-2); // recursive call
    }

    public static void main(String[] args) {
        
        fibo(4);
        System.out.println(fibo(4));
    }
}
