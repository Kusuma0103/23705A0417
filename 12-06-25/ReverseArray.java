import java.util.Arrays;
class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int[] arr = new int[nums.length];
        int j =0;
        for(int i=nums.length-1;i>=0;i--){
            arr[j]=nums[i];
            j++;
        }
        System.out.print(Arrays.toString(arr));
    }
}