// Last updated: 4/1/2026, 11:27:34 PM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        Collections.sort(nums); // sort the vector nums
4        int count = 0; // variable to store the count
5        int left = 0; // variable to store the left
6        int right = nums.size()-1; // variable to store the right
7        while(left < right){ // loop until left is less than right
8            if(nums.get(left) + nums.get(right) < target){ // if nums[left] + nums[right] is less than target
9                count += right-left; // update the count
10                left++; // increment the left
11            }
12            else{ // else
13                right--; // decrement the right
14            }
15        }
16        return count; // return the count
17        
18    }
19}