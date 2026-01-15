// Last updated: 1/15/2026, 11:52:54 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String, List<String>> map = new HashMap<>();
4        for(int i=0;i<strs.length;i++){
5            String key = GetKey(strs[i]);
6            if(!map.containsKey(key)){
7                map.put(key,new ArrayList<>());
8            }
9            map.get(key).add(strs[i]);
10        }
11        List<List<String>> ll = new ArrayList<>();
12        for(String key:map.keySet()){
13            ll.add(map.get(key));
14        }
15        return ll;
16    }
17    public String GetKey(String s){
18        int[] freq = new int[26];
19        for(int i=0;i<s.length();i++){
20            char ch = s.charAt(i);
21            freq[ch - 'a']++;
22        }
23        StringBuilder sb = new StringBuilder();
24        for( int i=0;i<freq.length;i++){
25            sb.append(freq[i]+"$");
26        }
27        return sb.toString();
28    }
29}