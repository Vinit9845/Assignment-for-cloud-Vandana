import java.util.Arrays;
import java.util.Collections;
 class ShuffleArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
