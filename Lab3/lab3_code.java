package Lab3;
import java.util.Scanner;
import java.util.Arrays;

public class lab3_code {
    public static float mean_arr(int[] arr) {
        int arr_count = 0;
        for (int i = 0; i < arr.length; i++) {  
            arr_count += arr[i];                // Counting the sum of the array
        }
        return  arr_count / arr.length;   // Finding mean by dividing sum with length
    
  }
  public static float median_arr(int[] arr) {
    Arrays.sort(arr);
    int mid = arr.length / 2;  // Finding the middle element
        if(arr.length % 2 == 0) {
            return  (arr[mid - 1] + arr[mid]) / 2; // If the number of elements are even then formula is arr[mid - 1] + arr[mid]) / 2
        } else {
            return arr[mid]; // If odd then return the middle element.
        }
    }
  public static float mode_arr(int[] arr) {
    int max_occur = 0;
    int mode = 0;
    for(int i =0;i<arr.length;i++){
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == arr[i]) { // getting the count of every number in the array.
                count++;
            }
        }
        if(count>max_occur){
            mode = arr[i];      // Assigning mode if the count is greater than maximum occur of a particular element
            max_occur = count;

        }
    }
    return mode;
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the length of the integer array: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    System.out.print("Enter " + n+" integers: ");

    for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
    }
    
    int options;

    do {
      System.out.println("\nMenu");
      System.out.println("1. Find mean");
      System.out.println("2. Find median");
      System.out.println("3. Find mode");
      System.out.print("Enter your choice: ");
      options = scanner.nextInt();
      scanner.nextLine();
      switch (options) {
        case 1:
            float mean = mean_arr(arr);
            System.out.println("Mean of the array is : " + mean);
            break;
        case 2:
            float median = median_arr(arr);
            System.out.println("Median of the array is : " + median);
            break;
        case 3:
            float mode = mode_arr(arr);
            System.out.println("Mode of the array is : " + mode);
            break;
        default:
            System.out.println("-----------Invalid choice. Try again-----------");
            break;
      }

    }while(options<=3);

    }
}
