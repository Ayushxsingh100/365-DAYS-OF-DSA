class Solution {
    public int maxProduct(int[] nums) {
        // base case :
        if(nums.length == 0){
            return 0;
        }
       // initializing the 3 variables :
       // for now first time assigning it the first element
        int min = nums[0];
        // for now first time assigning it the first element
        int max = nums[0];
        // the final updated max variable after all the traversing and all .. 
        // will be stored in the result as the final answer
        int result = max;

        // traversing loop for nums array :
       for(int i =1; i<nums.length ; i++){
        // declaring a curr_pointer for traversing element one by one 
        int curr_pointer = nums[i];
        // a temp named storage that will store Max variable comparisons and all !
        // this storage will compare --> 1.) contains curr_pointer it-self , 
        // 2.) the product of curr_pointer when multiplied by the recently used max variable 
        // 3.) the product of curr_pointer when multiplied by the recently used min variable 
        // THIS WILL STORE THE MAXIMUM OF ALL COMPARISON VARIABLE
        int temp_storage = Math.max(curr_pointer , Math.max(max*curr_pointer ,min*curr_pointer));
        // now for the minimum -->
        // this "min" will compare --> 1.) curr_pointer it-self, 
        // 2.) the product of curr_pointer when multiplied by the recently used max variable 
        // 3.) the product of curr_pointer when multiplied by the recently used min variable 
        // THIS WILL STORE THE MINIMUM OF ALL COMPARISON VARIABLE
        min = Math.min(curr_pointer , Math.min(min*curr_pointer , max*curr_pointer));
        // this will store the final max value after all comparisons one by one !!!
        max=temp_storage;
        // Store the result here 
        // this updates regularly as new max comes after all comparisons and traversing !
        result = Math.max(result , max);
       }
       // retrun the result
       return result;
    }
}
