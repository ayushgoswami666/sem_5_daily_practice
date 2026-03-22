// Last updated: 3/22/2026, 11:33:17 PM
1class Solution {
2    public int maxScoreWords(String[] words, char[] letters, int[] score) {
3        // Step 1: Count the available letters
4        Map<Character, Integer> lettersCounter = new HashMap<>();
5        for (char letter : letters) {
6            lettersCounter.put(letter, lettersCounter.getOrDefault(letter, 0) + 1);
7        }
8
9        // Step 2: Initialize the totalScore
10        int[] totalScore = new int[1];
11
12        // Step 3: Define the recursive function to explore all combinations
13        explore(words, lettersCounter, score, 0, 0, totalScore);
14
15        // Step 4: Return the maximum score found
16        return totalScore[0];
17    }
18
19    private void explore(String[] words, Map<Character, Integer> letterCounter, int[] score, int index, int currScore,
20            int[] totalScore) {
21        // Update the total score with the current score if it's higher
22        totalScore[0] = Math.max(totalScore[0], currScore);
23
24        // Base case: if all words have been considered, return
25        if (index == words.length) {
26            return;
27        }
28
29        // Step 3: Try each word starting from the current index
30        for (int i = index; i < words.length; i++) {
31            Map<Character, Integer> tmpCounter = new HashMap<>(letterCounter);
32            String word = words[i];
33            int wordScore = 0;
34            boolean isValid = true;
35
36            // Check if the word can be formed with the available letters
37            for (char ch : word.toCharArray()) {
38                if (tmpCounter.getOrDefault(ch, 0) > 0) {
39                    tmpCounter.put(ch, tmpCounter.get(ch) - 1);
40                    wordScore += score[ch - 'a'];
41                } else {
42                    isValid = false;
43                    break;
44                }
45            }
46
47            // If the word can be formed, explore further with the updated state
48            if (isValid) {
49                explore(words, tmpCounter, score, i + 1, currScore + wordScore, totalScore);
50            }
51        }
52    }
53}