// Last updated: 2/8/2026, 10:48:49 PM
1class Solution {
2    public String countAndSay(int n) {
3        if(n==1){
4            return "1";
5        }
6        StringBuilder prev = new StringBuilder("1");
7        int j = 1;
8        while(j<n){
9            StringBuilder sb = new StringBuilder();
10
11            int count =1;
12            for(int i =1;i<prev.length();i++){
13                if(prev.charAt(i)==prev.charAt(i-1)){
14                    count++;
15                }
16                else{
17                    sb.append(count).append(prev.charAt(i-1));
18                    count =1;
19                }
20            }
21            sb.append(count).append(prev.charAt(prev.length()-1));
22            prev = sb;
23            j++;
24        }
25        return prev.toString();
26
27        
28    }
29}