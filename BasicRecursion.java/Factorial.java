public class Factorial {
    
    static int fact(int n){

        if(n<=1){  // Base condition
            return 1;
        }else 
            return n*fact(n-1);  // Recursive call

    }

    public static void main(String[] args) {
        
        fact(5);
        System.out.println(fact(5));

    }
}
