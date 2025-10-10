public class Print_No_from_n_to_1 {

    

    public static void printName(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        printName(n-1);

    }

    public static void main(String[] args) {
        
        printName(5);

    }
    
}

    

