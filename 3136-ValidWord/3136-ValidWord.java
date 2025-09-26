// Last updated: 9/26/2025, 10:13:47 PM
class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean hasvowel = false;
        boolean hasconsonant = false;
        String vowel = "aeiouAEIOU";
        for(char c :word.toCharArray()){
            if(Character.isLetter(c)){
                if(vowel.indexOf(c)!=-1){
                    hasvowel=true;
                }
                else{
                    hasconsonant=true;
                }
            }
            else if(Character.isDigit(c)){
                continue;
            }
            else{
                return false;
            }

        }
        return hasvowel && hasconsonant;
        
    }
}