public class Swap {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Swap(arr, 0,4);
    }
    static void Swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        for (int element : arr){
            System.out.print(element);
        }
    }

}
