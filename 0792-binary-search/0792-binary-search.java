class Solution {
    public int search(int[] nums, int target) {
        //Divide the array by taking the length and dividing it by 2
        //Check if the pivot is the target. If it is, we found it and return it.
        //If the target is great than the number of the pivoted index then discard the left half
        //If not then discard the right half
        // We now have a sub array, repeat the same process on the sub array

        int boundary1 = 0;
        int boundary2 = nums.length - 1;

        //Loop starts here
        while (boundary1 <= boundary2){
            int pivot = ((boundary2 - boundary1) / 2) + boundary1;
            if (nums[pivot] == target){
                return pivot;
            }
            else{
                if (nums[pivot] < target){
                    //Make the left side (anything between the first index and pivot index) dissapear [boundary1, pivot]
                    boundary1 = pivot + 1;
                }
                else if (nums[pivot] > target){
                    //Make the right side (anything between the pivot index and last index) dissapear [pivot, boundary2]
                    boundary2 = pivot - 1;
                }
            }
        }
        //Loop ends here
        return -1;
    }
}