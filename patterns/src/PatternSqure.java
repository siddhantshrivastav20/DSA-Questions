//Problem statement
//Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
//
//For every value of ‘N’, help sam to print the corresponding N-dimensional forest.
//
//Example:
//Input: ‘N’ = 3
//
//Output:
//        * * *
//        * * *
//        * * *


public class PatternSqure {
    public static void main(String[] args){
        int stars = 4;
        pattern1(stars);
    }

    public static void pattern1(int stars){
        for(int i =0; i<stars; i++){
            for(int j =0; j<stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
