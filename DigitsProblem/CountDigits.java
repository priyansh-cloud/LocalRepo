
public class CountDigits {
    public static void main(String[] args) {

        int n= 9867;
        int count =0;

        while(n>0){
            
            int ld= n%10;
            System.out.println("Last digit: " + ld); // 👈 use ld
            count ++;
            n = n/10;
            
        }
        System.out.println("Total digits = " + count);
    }
    
}
