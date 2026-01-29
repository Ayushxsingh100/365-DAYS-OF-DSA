class Solution {
    public int [] twoSum (int[] nums , int target ){
        // initializing hashmap 
        // it stores two things --> key and value
        HashMap<Integer , Integer> map = new HashMap<>();
             
             // using a loop through the array
        for(int i =0 ; i<nums.length ; i++){
            // calculate the remaing by minus the target and cureent element 
            int remaining = target - nums[i];

            // check if remaining exists in hashmap table 
            if(map.containsKey(remaining)){
                // if the remaining already exist in the table simply , return the index of the 
                // current element and the remaing found element of the hashmap table 
                return new int[] {map.get(remaining) , i};
            }

            // store the current number with the index.
            map.put(nums[i],i);

        }

        return new int[] {};
    }
}
