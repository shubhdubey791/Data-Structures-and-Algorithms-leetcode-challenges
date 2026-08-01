class Solution {
    public int missingNumber(int[] nums) {
        int arraysum = 0;
        
        int n = nums.length;
        int actualsum = n*(n+1)/2;
        for(int i = 0;i<n; i++){
            arraysum += nums[i];
        }
int mn = actualsum - arraysum;

return mn;
	
    }
}