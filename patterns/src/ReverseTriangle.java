//Problem statement
//Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.
//
//Example:
//Input: ‘N’ = 3
//
//Output:
//
//        * * *
//        * *
//        *



public class ReverseTriangle {
    public static void main(String[] args){
        int n = 4;
        reverseTrianglePattern(n);
    }

    static void reverseTrianglePattern(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<= n-i+1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
