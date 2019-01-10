class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int[] a = new int[2]; 
        loop1:for(i=0;i<(nums.length-1);i++){
            for(j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    a[0]=i;
                    a[1]=j;
                    break loop1;
                }
            }
        }
    return a;
    }
}