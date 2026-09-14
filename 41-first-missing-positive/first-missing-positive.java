class Solution {
    public int firstMissingPositive(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<=nums.length){
                arr[nums[i]-1]=nums[i];
            }
        }
        for (int i=0;i<nums.length;i++){
            if(arr[i]==0){
                return i+1;
            }

        }
        return nums.length+1;
        
        
    }
}