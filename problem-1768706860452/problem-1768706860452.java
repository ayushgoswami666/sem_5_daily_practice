// Last updated: 1/18/2026, 8:57:40 AM
1class Solution {
2    public int vowelConsonantScore(String s) {
3        int v = 0,c=0;
4        for(char ch :s.toCharArray()){
5            if(Character.isLetter(ch)){
6                if(isVowel(ch)){
7                    v++;
8                }
9                else{
10                    c++;
11                }
12            }
13        }
14        return c>0 ? v/c :0;
15        
16    }
17    public static boolean isVowel(char ch){
18        return ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o'||ch== 'u';
19    } 
20}