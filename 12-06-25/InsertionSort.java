class InsertionSort{
    public static void main(String[] args){
        int[] nums={10,5,6,12,4,8};
        for(int i=1;i<nums.length;i++){
            int key = nums[i];
            int j=i-1;
            while(j>=0&&nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        for(int val : nums){
            System.out.println(val + " ");
        }   
    }    
}