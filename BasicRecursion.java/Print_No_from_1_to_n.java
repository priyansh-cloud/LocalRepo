public class Print_No_from_1_to_n {

    public static void printNum(int n){

        if(n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);

    }
    public static void main(String[] args) {
        
        printNum(1);
    }
    
}
