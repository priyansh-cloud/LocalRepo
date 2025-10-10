public class Recursion {

    public static void printName(int n){

        if(n==0){
            return;
        }
        System.out.println("Priyanshu");
        printName(n-1);

    }

    public static void main(String[] args) {
        
        printName(5);

    }
    
}
