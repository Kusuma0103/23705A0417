class LinearSearch {
    public static void main(String[] args) {
     System.out.println(linearSearch(new int[] {10,19,2,3,1,8,9},19)); 
    }
    public static int linearSearch(int[] nums,int target){
        for(int i =0 ;i< nums.length;i++){
            if(target==nums[i]) return i;
        }
        return -1;
    }
}