// Last updated: 10/10/2025, 1:54:09 PM
class Solution {
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        List<String> l1 = new ArrayList<>();
        if(digits.length()==0){
            return l1;
        }
        combination(digits,"",l1);
        return l1;

        
    }
    public static void combination(String digits,String ans,List<String> l1){
        if(digits.length()==0){
            l1.add(ans);
            return;
        }
      
            char ch = digits.charAt(0);
            int n = (int) ch -48;
            String ques = map[n];

            for(int j=0;j<ques.length();j++){
                combination(digits.substring(1),ans+ques.charAt(j),l1);
            }
        
    }
}