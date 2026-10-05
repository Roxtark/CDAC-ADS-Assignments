import java.util.Arrays;

public class Problem3 {
public static void main(String[] args) {

    int[] arr = {0,5,0,3,8,0,2};

    int n = arr.length;

    int position = 0;

    for (int i = 0; i < n; i++) {

        if (arr[i] != 0) {

            arr[position] = arr[i];
            position++;
        }
    }

    while (position < arr.length) {

        arr[position] = 0;
        position++;
    }

    System.out.println(Arrays.toString(arr));
  }

}

