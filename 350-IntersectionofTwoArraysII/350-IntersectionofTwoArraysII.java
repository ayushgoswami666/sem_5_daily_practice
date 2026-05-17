// Last updated: 5/17/2026, 12:31:22 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        return Two_arr(nums1,nums2);
4        
5    }public static int[] Two_arr(int[] nums1,int[] nums2){
6        HashMap<Integer,Integer> map = new HashMap<>();
7        for(int i =0;i<nums1.length;i++){
8            if(map.containsKey(nums1[i])){
9                int v = map.get(nums1[i]);
10                map.put(nums1[i],v+1);
11            }
12            else{
13                map.put(nums1[i],1);
14            }
15        }
16        List<Integer> ll = new ArrayList<>();
17        for(int i =0;i<nums2.length;i++){
18            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
19                ll.add(nums2[i]);
20                int v = map.get(nums2[i]);
21                map.put(nums2[i],v-1);
22
23            }
24        }
25        int[] arr = new int[ll.size()];
26        for(int i=0;i<arr.length;i++){
27            arr[i] = ll.get(i);
28        }
29        return arr;
30    }
31}