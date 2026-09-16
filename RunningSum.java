public class RunningSum {
    public static void main(String[] args) {
        Solution();
    }

    static void Solution() {
        int[] arr = {2, 3, 4, 5};

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        for (int element : arr){
            System.out.print(element + " ");
        }
    }
}