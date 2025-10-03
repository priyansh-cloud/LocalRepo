

public class ReverseNumber {
    public static void main(String[] args) {
        
        int n= 5084;
        int RevNum=0;

        while(n>0){
            
            int ld= n%10;
            n = n/10;
            RevNum= (RevNum *10) +ld;

        }
        System.out.println(RevNum);
        
    }
    
}
