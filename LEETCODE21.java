class Solution {
    public boolean containsDuplicate(int[] nums) {
        // declaring a hashset
        HashSet<Integer> numSet = new HashSet<>();
       // initialing a for each loop to traverse through the array
        for(int i : nums){
            // if the number is already in the set , we found duplicate
            if(numSet.contains(i)){
                return true ;
            }
            // if number is not in the set we go in the else loop 
            // add the numbers one by one but if found the element retun true using (.contain);
            numSet.add(i);
        }
        // return false if no duplicate exist
        return false;
    }
}
