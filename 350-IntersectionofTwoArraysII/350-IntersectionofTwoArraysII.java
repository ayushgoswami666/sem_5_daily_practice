// Last updated: 1/13/2026, 1:24:16 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        return Two_arr(nums1,nums2);
4    }
5         
6    public static int[] Two_arr(int[] nums1,int[] nums2){
7        HashMap<Integer,Integer> map = new HashMap<>();
8        for(int i =0;i<nums1.length;i++){
9            if(map.containsKey(nums1[i])){
10                // int v = map.get(nums1[i]);
11                // map.put(nums1[i],v+1);
12
13            }
14            else{
15                map.put(nums1[i],1);
16            }
17        }
18        List<Integer> ll = new ArrayList<>();
19        for(int i =0;i<nums2.length;i++){
20            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
21                ll.add(nums2[i]);
22                map.put(nums2[i],map.get(nums2[i])-1);
23            }
24
25        }
26        int[] ans = new int[ll.size()];
27        for(int i =0;i<ans.length;i++){
28            ans[i] = ll.get(i);
29        }
30        return ans;
31    }
32                
33                
34                
35
36        
37    
38}