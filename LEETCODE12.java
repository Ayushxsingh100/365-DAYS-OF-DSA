class Solution {
    public int maxArea(int[] height) {
        // declaring three variables -->
 // initializing the max variable that will store the max water in the contianer (in units)
       int max = 0;
       // initializing the left variable that will start from the first element of the array
       int left = 0;
       // initializing the right varibale that will start from the last of the array
       int right = height.length-1;
     // use while loop (until left crosses right or both come at the same place)
       while(left<right){
        // calculting the width for AREA formula ...
        int width = right-left;
        // calculate the area by slecting the small height element and multiplying it with width
        int area = Math.min(height[left],height[right])*width;
         // update the maximum area 
        max = Math.max(max,area);
        // if the height of left is small then right ( we move left)
        if(height[left] <= height[right]){
            left++;
        }
        // if the height of right is small then left ( we move right)
        else {
            right--;
        }
 
       }
       return max;
    }
}
