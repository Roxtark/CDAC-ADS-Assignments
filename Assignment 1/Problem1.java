public class Problem1{
   public static void main(String[] args) {
      int[] arr = {15,8,23,4,19,7};
       int n = arr.length;

       int Max = Integer.MIN_VALUE;
       int Min = Integer.MAX_VALUE;

       for(int i =0; i<n; i++){
          if(arr[i] > Max) Max = arr[i];
          if(arr[i] < Min) Min = arr[i];
         }

      System.out.println("Maximum = " + Max);
      System.out.println("Minimum = " + Min);

   }

}