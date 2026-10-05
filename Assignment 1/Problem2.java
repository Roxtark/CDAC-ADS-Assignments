public class Problem2 {
    public static void main(String[] args) {

    int[] arr = {12,5,8,20,15,20,7};
    int n = arr.length;

    int Largest = Integer.MIN_VALUE;
    int SecondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {

        if (arr[i] > Largest) {
            SecondLargest = Largest;
            Largest = arr[i];

        } else if (arr[i] > SecondLargest && arr[i] != Largest) {
            SecondLargest = arr[i];
        }
    }

    System.out.println("Second Largest = " + SecondLargest);
}

}
