// Last updated: 10/3/2025, 9:52:34 PM
class Solution {
    public String reverseVowels(String s) {
        int low =0;
        int high = s.length()-1;
        String v = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        while(low<high){
            while(low<high && v.indexOf(s.charAt(low))==-1){
                low++;
            }
            while(low<high && v.indexOf(s.charAt(high))==-1){
                high--;
            }
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return new String(arr);

        
    }
}