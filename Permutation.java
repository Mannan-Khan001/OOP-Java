public class Permutation {
    static void main(String[] args) {
        Per();
    }
    static void Per(){
        int[]arr = {0,2,1,5,3,4};
        int [] nums = new int [6];

        for (int i = 0; i < 6; i++) {
            nums[i] = arr[arr[i]];
            System.out.print(nums[i] + " ");
        }
    }
}
