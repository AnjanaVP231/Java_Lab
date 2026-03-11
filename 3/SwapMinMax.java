import java.util.Scanner;

public class SwapMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for(int i=1;i<n;i++) {
            if(arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        System.out.println("Array after swapping min and max:");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
         System.out.print("\n");
    }
}
