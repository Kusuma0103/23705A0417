import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ; ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(Arrays.toString(arr));
    }
}