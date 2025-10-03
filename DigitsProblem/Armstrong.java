

public class Armstrong {
    public static void main(String[] args) {
        
         int num=153;
        int n= num;
        int sum=0;

        while(n>0){
            int ld= n%10;
            n=n/10;
            sum= sum + (ld*ld*ld);
        }

            if(num==sum){

                System.out.println(sum + " is Armstrong");

        }else 
            System.out.println("not Armstrong");
        
    }
    
}
