

public class Palindrome {
    public static void main(String[] args) {
        
        int num=121;
        int n= num;
        int RevNum=0;

        while(n>0){
            int ld= n%10;
            n=n/10;
            RevNum= (RevNum *10) +ld;
        }

            if(num==RevNum){

                System.out.println(RevNum + " is palindrome");

        }else 
            System.out.println("not plindrome");
        

       

    }
    
}
