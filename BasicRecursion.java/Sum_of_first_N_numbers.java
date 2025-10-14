public class Sum_of_first_N_numbers {
    
    public static void Sum_Of_Numbers(int n, int sum){

        if(n<1){  // Base case

            System.out.println(sum);  // 2️⃣ Work (optional) – do something before recursion
             // e.g., print value, add number, etc.
            return;
        }

        Sum_Of_Numbers(n-1,sum+n);  // Recursive call

    }

    public static void main(String[] args) {
        
        Sum_Of_Numbers(2,0);
    }
}
