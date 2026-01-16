// Last updated: 1/16/2026, 11:44:49 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        
4        int arr[] = new int[matrix[0].length];
5        int ans=0;
6        for(int i=0;i<matrix.length;i++){
7            for(int j=0;j<matrix[0].length;j++){
8                if(matrix[i][j] == '0'){
9                    arr[j] = 0;
10                }else{
11                    arr[j]++;
12                }
13            }
14            ans = Math.max(ans,largest_his(arr));
15        }
16        return ans;
17    }
18    public static int largest_his(int arr[]){
19        Stack<Integer> st = new Stack<>();
20        int ans = 0;
21        for(int i=0;i<arr.length;i++){
22            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
23                int h = arr[st.pop()];
24                int r = i;
25                if(st.isEmpty()){
26                    ans =  Math.max(h*r,ans);
27                }else{
28                    int l = st.peek();
29                    int area = h*(r - l -1);
30                    ans = Math.max(area,ans);
31                }
32            }
33            st.push(i);
34        }
35        int r = arr.length;
36        while(!st.isEmpty() ){
37            int h = arr[st.pop()];
38            if(st.isEmpty()){
39                ans =  Math.max(h*r,ans);
40            }else{
41                int l = st.peek();
42                int area = h*(r - l -1);
43                ans = Math.max(area,ans);
44            }
45        }
46       return ans;
47    }
48}
49        
50  