class Solution {
   // made a function to return the result array that will contain the 
   // (first index , last index )
    public int[] searchRange(int[] nums, int target) {
        // we make a function findbound that will return true if we find      first element 
        int first = findBound(nums, target, true);
            // we make a function findbound that will return true if we find      last element 
        int last = findBound(nums, target, false);
       // we put both the indeices in one array and return the first and the last
        return new int[]{first, last};
    }
       // a function using binary search.....
    public int findBound(int[] nums, int target, boolean isFirst) {
        // standard binary search base requirements
        int start = 0;
        int end = nums.length - 1;
        // we there is no target we return -1 as a default answer
        int ans = -1;
       // running a loop until the array closes or we can say that array elements get over 
        while (start <= end) {
            // acc. to binary search we take out mid element
            int mid = start + (end - start) / 2;
         // condition 1 :
            if (nums[mid] == target) {
                // --> if we find the target equal to the mid 
                ans = mid;
        // firstly we check the first element so always we go in the left side of the mid becuase we may find mid there .... 
                if (isFirst) {
                    // wee shift the end  element to mid -1 ....
                    end = mid - 1;   
                    // and if we want to find the last element we go to the right side 
                    // we change the state of start to mid + 1 to find tge last element 
                } else {
                    start = mid + 1; 
                }
        // CONDITION 2 :
            } else if (nums[mid] < target) {
                // if the mid < target is in the right simple logic ...
                start = mid + 1;
            } else {
                // if the mid > target is in the left simple logic ...
                end = mid - 1;
            }
            // after all these conditions this happens that if the else runs 
            // there will be always the case that the ( mid == target ) so atlast we will always find the mid == target ... 
        }

        return ans;
    }
}
