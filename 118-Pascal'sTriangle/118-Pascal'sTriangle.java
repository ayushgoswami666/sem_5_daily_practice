// Last updated: 8/1/2025, 9:56:22 PM
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
            
            for (int j = 1; j < i; j++) {
                int val = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
                row.set(j, val);
            }
            pascal.add(row);
        }
        return pascal;
    }
}