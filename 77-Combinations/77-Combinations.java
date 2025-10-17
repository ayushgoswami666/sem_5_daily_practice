// Last updated: 10/17/2025, 11:50:06 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        boolean[] board = new boolean[n];
        Combination(n,k,board,ll,l1,0,0);
        return ll;
         
        
    }
    public static void Combination(int n ,int k,boolean[] board,List<List<Integer>> ll,List<Integer> l1 ,int kpsf,int idx){
        if(k==kpsf){
            ll.add(new ArrayList<>(l1));
            return;
        }
        for(int i = idx;i<n;i++){
            if(board[i]==false){
                board[i] = true;
                l1.add(i+1);
                Combination(n,k,board,ll,l1,kpsf+1, i+1);
                board[i] = false;
                l1.remove(l1.size()-1);
            }
        }

    }
}