import java.util.Arrays;

public class SquaresOfASortedArray {

    /**
     * Given an array of integers A sorted in non-decreasing order,
     * return an array of the squares of each number, also in sorted non-decreasing order.
     * Example 1:
     * Input: [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     *
     * Example 2:
     * Input: [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     */

    public static void main(String[] args) {
        int test[] = {-4,-1,0,3,10};
        int test2[] ={-7,-3,2,3,11};
        test  = sortedSquares(test);
        test2 = sortedSquares(test2);
        for (int a: test){
            System.out.print(a+" ");
        }
        System.out.println();
        for (int a: test2){
            System.out.print(a+" ");
        }
    }

    public static int [] sortedSquares(int[] a){
        int [] arr  = new int[a.length];
        for (int i=0;i<a.length;i++){
            arr[i]=a[i]*a[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
