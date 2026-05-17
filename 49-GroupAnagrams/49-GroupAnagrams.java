// Last updated: 5/17/2026, 11:00:29 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>> map = new HashMap<>();
4        for(int i =0;i<strs.length;i++){
5            String key = getkey(strs[i]);
6            if(!map.containsKey(key)){
7                map.put(key,new ArrayList<>());
8            }
9            map.get(key).add(strs[i]);
10        }
11        List<List<String>> ans = new ArrayList<>();
12        for(String Key : map.keySet()){
13            ans.add(map.get(Key));
14        }
15        return ans;
16        
17    }
18    public static String getkey(String str){
19        int[] freq = new int[26];
20        for(int i =0;i<str.length();i++){
21            int idx = str.charAt(i) - 'a';
22            freq[idx] = freq[idx]+1;
23
24        }
25        StringBuilder sb = new StringBuilder();
26        for(int i =0;i<freq.length;i++){
27            sb.append(freq[i]+'$');
28        }
29        return sb.toString();
30    } 
31}