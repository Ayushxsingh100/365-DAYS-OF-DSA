class Solution {
    public int[] productExceptSelf(int[] nums) {
        // creating a secondary array to store the result;
        int [] result = new int[nums.length];
       // Filling the array with 1 at each element !
        Arrays.fill(result ,1);
       // intializing two var.( used for sliding across the array !)
        int prefix = 1 , postfix = 1 ;
        // loop for prefix ( start from the first element)
        for(int i = 0 ; i<nums.length;i++){
            // assigning the current running element to the result array ( for default = 1)
            result[i] = prefix;
            // updating the running element to the next index 
            prefix = nums[i]*prefix;
        } 
         // loop for postfix .. starting from last element of the array
        for ( int i = nums.length - 1; i>=0;i--){
            //  for multiplying the stored prefix element to the current postfix element
            result[i] = result[i] * postfix;
            // updating the postfix as soon as it is moving towards the left ...
            postfix = postfix * nums[i];
        }
        
        return result;
    }


    // SUMMARY --> 1.) the intial value of result array was -- [1,1,1,1]
    // 2.) as the array element shift one by one the prefix changes by multiplication with the element  
    // 3.) 
}
