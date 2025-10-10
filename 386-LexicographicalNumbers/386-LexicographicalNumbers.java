// Last updated: 10/10/2025, 11:51:05 AM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l1 = new ArrayList<>();
        lexi_co(n,0,l1);
        l1.remove(0);
        return l1;

        
    }
    public static void lexi_co(int n,int curr,List<Integer> l1){
        if(curr>n){
            return;
        }
        l1.add(curr);
        int i =0;
        if(curr==0){
            i =1;
        }
        for(;i<=9;i++){
            lexi_co(n,curr*10+i,l1);
        }

        
    }
}