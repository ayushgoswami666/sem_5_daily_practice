// Last updated: 10/13/2025, 10:47:00 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        Combination(candidates,target,l1,0,l2);
        return l1;
        
    }
    public static void Combination(int[] coin,int target,List<List<Integer>> l1,int idx,List<Integer> l2){
        if(target == 0){
            l1.add(new ArrayList<>(l2)); 
            return;
        }
       
        for(int i =idx;i<coin.length;i++){
            if(target>=coin[i]){
            l2.add(coin[i]);
            Combination(coin,target-coin[i],l1,i,l2);//infinite supply nahi toh i+1 hota
            l2.remove(l2.size()-1);
            }
        }
    }
}