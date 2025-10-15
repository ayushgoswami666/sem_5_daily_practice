// Last updated: 10/15/2025, 2:46:02 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ll = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        partioning(s,l1,ll);
        return ll;
        
    }
    public static void partioning(String s,List<String> l1,List<List<String>> ll ){
        if(s.length()==0){
            ll.add(new ArrayList<>(l1));

            return;
        }
        for(int j =1;j<=s.length();j++){
            String str = s.substring(0,j);
            if(ispalindrome(str)){
                l1.add(str);
            partioning(s.substring(j),l1,ll);
            l1.remove(l1.size()-1);
            }
        }


    }
    public static boolean ispalindrome(String str){
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}