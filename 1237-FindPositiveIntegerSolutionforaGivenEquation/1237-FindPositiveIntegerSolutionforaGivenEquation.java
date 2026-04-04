// Last updated: 4/4/2026, 11:42:13 PM
1/*
2 * // This is the custom function interface.
3 * // You should not implement it, or speculate about its implementation
4 * class CustomFunction {
5 *     // Returns f(x, y) for any given positive integers x and y.
6 *     // Note that f(x, y) is increasing with respect to both x and y.
7 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
8 *     public int f(int x, int y);
9 * };
10 */
11
12class Solution {
13    public List<List<Integer>> findSolution(CustomFunction func, int z) {
14        List<List<Integer>> result= new ArrayList<>();
15
16        for(int i=1; i<= 1000; i++){
17            int x= i;
18
19            int left= 1;
20            int right= 1000;
21
22            while(left <= right){
23                int y= (left+right)/2;
24
25                int val= func.f(x, y);
26                if(val == z){
27                    List<Integer> l1= new ArrayList<>();
28                    l1.add(x);
29                    l1.add(y);
30
31                    result.add(l1);
32                    break;
33                }
34                else if(val > z){
35                    right= y-1;
36                }
37                else{
38                    left= y+1;
39                }
40            }
41        }
42
43        return result;
44    }
45}