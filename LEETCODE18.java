class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // inbuilt feature to sort the array (O(logn))
        Arrays.sort(nums);
        // emply list to store all 3 numbers in that
        List<List<Integer>> result = new ArrayList<> ();
        // MAIN LOOP --> always checks if the first  array of numbers is smaller 
        // so automatic if 1st number is positive so the sum would never be achieved
        // so , we can say it is a base condition
        for(int i = 0; i<nums.length && nums[i] <=0 ; i++ ){
            // we skips duplicates ( if the current element is same as the prev. element 
            // there exist duplicates )
            if(i ==0 || nums[i] != nums[i-1]){
                // if we get unique number (we call the twosum2 func. so that we can start finding the rest two numbers from the array)
                twoSum2(nums,i,result);
            }
        }
        

        return result ;
    }
             // actual logic :
        void twoSum2 (int[] nums , int i , List<List<Integer>> result){
            // we set two pointers --> one pointer on the start of array
            // one at the last of the array
            int left = i+1;
            int right = nums.length-1;
               

            // till the pointers dont cross each other this looop will work
            while(left<right){
                // we calculate the sum of all three numbers
                int sum = nums[i] + nums[left] + nums[right];

             // // if the sum is small then zero 
             // we do left ++
                if(sum <0){
                    left ++;
                }
                   // // if the sum is greater then zero 
             // we do right --
                else if (sum > 0){
                    right--;
                }
                // when we get exactly the sum
                else{
                    // add the matching triplet to the list
                    result.add(Arrays.asList(nums[i] , nums[left++] , nums[right--]));
                    // after adding the triplet if it is the same as previous in the list 
                    // we skip that triplet becuase we dont need duplicates......
                    while(left<right && nums[left] == nums[left-1]){
                        ++ left;
                    }
                    // hogyaaaaaaaaaaaaaaa!
                }
            }

        }
    }
