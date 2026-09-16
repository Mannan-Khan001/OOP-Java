import java.util.Arrays;
import java.util.Scanner;

public class SmallerNumberCount {
    public static void main() {
        SmallerCount();
    }
    static void SmallerCount(){
       int [] array = {1,5,3,8,6};
       Arrays.sort(array);
        for (int i = 0; i < 5; i++) {
            if (i == 0){
                System.out.println("0 smaller than " + array[i]);
            } else {
                System.out.println(i + " smaller than " + array[i]);
            }
        }
    }
}
