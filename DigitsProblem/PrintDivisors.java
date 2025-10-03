

public class PrintDivisors {
    public static void main(String[] args) {
        
        int n =12;

        System.out.println("The divisor of " + n + " is :");
        for(int i=1; i<=n; i++){

           
            if(n%i==0){
                
                System.out.println(i);
                
            }
            
        }
    }
    
}
