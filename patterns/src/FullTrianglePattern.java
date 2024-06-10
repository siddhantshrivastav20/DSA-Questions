//Problem statement
//Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.
//
//Example:
//Input: ‘N’ = 3
//
//Output:
//
//          *
//         ***
//        *****





public class FullTrianglePattern {
    public static void main(String[] args){
        int n = 4;
        fullTrianglePrint(n);
    }

    static void fullTrianglePrint(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j =1; j<=i*2-1; j++){
                System.out.print("*");
            }
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
