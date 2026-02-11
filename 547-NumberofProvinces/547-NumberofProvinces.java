// Last updated: 2/11/2026, 12:52:26 PM
1class Solution {
2 private HashMap<Integer,List<Integer>> map ;
3    public int findCircleNum(int[][] isConnected) {
4        map = new HashMap<>();
5        for(int i = 0;i<isConnected.length;i++){
6            map.put(i+1,new ArrayList<>());
7        }
8        for(int i =0;i<isConnected.length;i++){
9            for(int j =0;j<isConnected[0].length;j++){
10                if(isConnected[i][j]==1){
11                    map.get(i+1).add(j+1);
12                    map.get(j+1).add(i+1);
13
14                }
15
16            }
17        }
18        return BFS();
19        
20    }
21    public int BFS(){
22        Queue<Integer> q = new LinkedList<>();
23        HashSet<Integer> visited = new HashSet<>();
24        int count =0;
25        for(int src : map.keySet()){
26            if(visited.contains(src)){
27                continue;
28
29            }
30        q.add(src);
31        count++;
32        while(!q.isEmpty()){
33            // 1.remove
34            int r = q.poll();
35            // 2. Ignore
36            if(visited.contains(r)){
37                continue;
38
39            }
40            // 3.Marked visited
41            visited.add(r);
42            // 4.self work
43            // System.out.print(r+" ");
44            // 5.Add univisited nbrs
45            for(int nbrs:map.get(r)){
46                if(!visited.contains(nbrs)){
47                    q.add(nbrs);
48                }
49            }
50           
51        }
52        // System.out.println();
53    }
54    return count;
55        
56}
57}