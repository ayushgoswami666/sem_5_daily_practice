// Last updated: 10/17/2025, 11:11:03 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        
        Permutation(nums,l1,ll);
        return ll;

        
        
    }
    public static void Permutation(int[] nums,List<Integer> l1,List<List<Integer>> ll){
        if(l1.size() == nums.length){
            ll.add(new ArrayList<>(l1));
            return;

        }
        for(int i =0;i<nums.length;i++){
            int ele = nums[i];
            if(l1.contains(ele)){
                continue;
            }
            l1.add(ele);
            Permutation(nums,l1,ll);
            l1.remove(l1.size()-1);
            
            
            



        }
    }
}