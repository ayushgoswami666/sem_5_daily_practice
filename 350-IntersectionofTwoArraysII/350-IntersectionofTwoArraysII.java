// Last updated: 1/13/2026, 3:08:35 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3
4        // HashSet<Integer> set = new HashSet<>();
5        // int ans =0;
6        // for(int i=0;i<nums.length;i++){
7        //     set.add(nums[i]);
8
9        // }
10        // for(int i=0;i<nums.length;i++){
11        //     if(!set.contains(nums[i]-1)){
12        //         int c =0;
13        //         int key=nums[i];
14
15        //         while(set.contains(key)){
16        //             set.remove(key);
17        //             c++;
18        //             key++;
19        //         }
20        //         ans= Math.max(ans,c);
21        //     }
22        // }
23        // return ans;
24        HashMap<Integer,Boolean> map = new HashMap<>();
25        for(int i =0;i<nums.length;i++){
26            if(map.containsKey(nums[i]-1)){
27                map.put(nums[i],false);
28            }
29            else{
30                map.put(nums[i],true);
31            }
32            if(map.containsKey(nums[i]+1)){
33                map.put(nums[i]+1,false);
34            }
35        }
36        int ans = 0;
37        for(int key : map.keySet()){
38            if(map.get(key)){
39                int count= 0;
40                while(map.containsKey(key)){
41                    count++;
42                    key++;
43                }
44                ans = Math.max(ans,count);
45            }
46        }
47        return ans;
48        
49    }
50}