public class Hollow_Butterfly {
    public static void main(String[] args) {
        
        int  n=4;
for(int i=1; i<=n; i++){

    // left side spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    // left side star
    for(int j=1; j<=i; j++){
        if(j==1 || j==i){
            System.out.print("* ");
        }else System.out.print("  ");
    }
    // Middle space
    for(int j=1 ; j<=2*(n-i); j++){
        System.out.print(" ");
    }
    // right side star
    for(int j=1; j<=i; j++){
        if(j==1 || j==i){
            System.out.print("* ");
        }else System.out.print("  ");
    }
System.out.println();

}


    }
}
