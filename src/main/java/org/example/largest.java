import java.util.Arrays;

public class NthLargest {
    public static void main(String[] args) {

        int[] arr = {10, 45, 3, 99, 23, 78};

        int n = 2; // 👈 change this: 1 = largest, 2 = second, 3 = third

        if (n > arr.length) {
            System.out.println("Invalid input");
            return;
        }

        // descending order sort
        Arrays.sort(arr);

        int result = arr[arr.length - n];

        System.out.println(n + "th Largest Number: " + result);
    }
}
