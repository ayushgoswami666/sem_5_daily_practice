// Last updated: 10/17/2025, 11:27:56 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        boolean[] board = new boolean[nums.length];
        Arrays.sort(nums);
        permutation(nums,board,ll,l1);
        return ll;

        
    }
    public static void permutation(int[] nums,boolean[] used,List<List<Integer>> ll, List<Integer> l1){
        if(l1.size()==nums.length){
            ll.add(new ArrayList<>(l1));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(used[i] || i>0 &&nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }
            used[i] = true;
            l1.add(nums[i]);
            permutation(nums,used,ll,l1);
            used[i]= false;
            l1.remove(l1.size()-1);
        }

    }
}