public class NthLargest {

    public static void main(String[] args) {

        int[] arr = {10, 45, 3, 99, 23, 78};
        int n = 2;   // 👈 change only this

        int result = 0;

        for (int i = 1; i <= n; i++) {

            int max = Integer.MIN_VALUE;
            int index = 0;

            // find largest
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }

            result = max;                 // store result
            arr[index] = Integer.MIN_VALUE; // remove used value
        }

        System.out.println(n + "th Largest = " + result);
    }
}
