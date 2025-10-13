public class Hollow_Diamond_pyramid {
    public static void main(String[] args) {
        

        //! note :
//  i == 1 : Top row
//  i == n : Bottom row
//  j == 1 : Left border
//  j == i : Right border


int n =5;

for(int i=1; i<=n; i++){
    // space
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //star
    for(int j=1; j<=2*i-1; j++){
        if(i==1 || j==1 ||  j==2*i-1){ 

            // i == 1 : when we’re on the upper/top row (like row 1)
            // j == 1 : when we’re on the first column (left border)
            //j == 2*i-1 : when we’re on the last column (right border)

            System.out.print("*" );
        }else System.out.print(" ");
        
    }
    System.out.println();
}
for(int i=n-1; i>=1; i--){
    // space
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //star
    for(int j=1; j<=2*i-1; j++){
        if(i==1 || j==1 ||  j==2*i-1){

            System.out.print("*" );
        }else System.out.print(" ");
        
    }
    System.out.println();
}

 
    }
}
