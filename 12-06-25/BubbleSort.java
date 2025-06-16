class BubbleSort{
    public static void main(String[] args){
        int[] nums={10,5,6,12,4,8};
        for(int j=0;j<nums.length;j++){
            boolean isSwapped = false;
            for(int i =0; i<nums.length-j-1;i++){
                if(nums[i]>nums[i+1]){
                    int temp = nums[i];
                    nums[i]= nums[i+1];
                    nums[i+1]=temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped)break;
        }
        for(int val : nums){
            System.out.print(val + " ");
        }
    }    
}