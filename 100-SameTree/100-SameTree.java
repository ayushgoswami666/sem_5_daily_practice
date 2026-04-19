// Last updated: 4/19/2026, 9:29:56 PM
1class Solution {
2    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
3        List<List<Integer>>ans = new ArrayList<>();
4        List<Integer>list = new ArrayList<>();
5        list.add(0);
6        dfs(0,graph,ans,list);
7
8        return ans;
9
10    }
11
12    public void dfs(int vtx,int graph[][], List<List<Integer>>ans, List<Integer>list){
13        if(vtx==graph.length-1){
14            ans.add(new ArrayList<>(list));
15        }
16
17        for(int ngbr : graph[vtx]){
18            list.add(ngbr);
19            dfs(ngbr,graph,ans,list);
20            list.remove(list.size()-1);
21        }
22    }
23}