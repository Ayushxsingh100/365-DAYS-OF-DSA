class Solution {
    public int maxSubArray(int[] nums) {
        // initializing two pointers 
        int curr_Sum = 0;
        // eqaul to first element for the special case as if only there is one element
        int Max_sum = nums[0];
         // for loop -->
         for(int i = 0; i<nums.length ; i++){
            // if there is a negative value just remove it by initializing it with 0
            if(curr_Sum < 0){
                curr_Sum =0;
            }
            // as the loop traverse add the values one by one with curr_Sum 
            curr_Sum = curr_Sum + nums[i];
            // once the elements gets add in this curr_Sum
            // it is compared again and again with max sum ...
            // if there exist a big sum than the max_sum
            // the value of max_sum gets updated ..
            Max_sum = Math.max(curr_Sum , Max_sum);
         }
         return Max_sum;
    }
}
