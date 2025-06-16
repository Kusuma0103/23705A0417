class SelectionSort{
    public static void main(String[] args){
        int[] nums={10,5,6,12,4,8};
        for(int i=0;i<nums.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[midIndex]>nums[j]){
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }
    }    
}