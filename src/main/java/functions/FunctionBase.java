package functions;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Дмитрий on 07.08.2017.
 */
public class FunctionBase {
    public static String generateRandomNumber(int col) {
        if (col <= 0) return "";
        Random random = new Random();
        int[] arr = new int[col];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = random.nextInt(10);
        }
        String rand = Arrays.toString(arr).replace(",", "").replace("[", "").replace(" ", "").replace("]", "");
        return rand;
    }

    public static String generateRandomChars(int col) {
        if (col <= 0) return "";
        Random random = new Random();
        char[] arr = new char[col];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (char) (random.nextInt(26) + 'a');
        }
        String rand = Arrays.toString(arr).replace(",", "").replace("[", "").replace(" ", "").replace("]", "");
        return rand;
    }
}