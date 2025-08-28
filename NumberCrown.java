public class NumberCrown {

    public static void main(String[] args) {
        int n=3;
        for(int i=0; i<=n ; i++){

            for(int j =1; j<= i; j++){     // number
                System.out.print(j);
            }

            for(int j=1; j<= n*2 - 2*i; j++){   // spaces
                System.out.print(" ");
            }

            for(int j =i; j>= 1; j--){     // rev no.
                System.out.print(j);
            }

            System.out.println();


        }
    }
    
}
