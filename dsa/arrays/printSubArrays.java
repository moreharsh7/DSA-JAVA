public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {

                // Print subarray from start to end 
                System.out.print("[ ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("]");
            }
        }
    }
}
