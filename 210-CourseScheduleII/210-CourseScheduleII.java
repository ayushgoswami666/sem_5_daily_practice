// Last updated: 11/20/2025, 1:40:00 AM
class Solution {
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // 1) initialize map for ALL courses (0 .. numCourses-1)
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }

        // 2) build graph and indegree array
        for (int i = 0; i < prerequisites.length; i++) {
            int v1 = prerequisites[i][0];
            int v2 = prerequisites[i][1];
            map.get(v2).add(v1); // edge v2 -> v1 (v2 is prereq for v1)
        }

        int[] ind = indegree(numCourses);
        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[numCourses];
        int count = 0;

        for (int i = 0; i < ind.length; i++) {
            if (ind[i] == 0) {
                q.add(i);
            }
        }
        int idx =0;

        while (!q.isEmpty()) {
            int r = q.poll();
            ans[idx++] = r;
            count++;
            for (int nbrs : map.get(r)) {
                ind[nbrs]--;
                if (ind[nbrs] == 0) {
                    q.add(nbrs);
                }
            }
        }
        if(count!=numCourses){
            return new int[0];
        }

        return ans;
        
    }

    // compute indegree for numCourses nodes
    public int[] indegree(int numCourses) {
        int[] ind = new int[numCourses];
        for (int key : map.keySet()) {
            for (int nbrs : map.get(key)) {
                ind[nbrs]++;
            }
        }
        return ind;
    
        
    }
}