public class Concatenation {
    public static void main(String[] args) {
        Con();
    }
    public static void Con(){
        int [] arr = {1,2,1};
        int n = arr.length;
        int [] nums = new int[2 * n];

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
            nums[i + n] = arr[i];
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
