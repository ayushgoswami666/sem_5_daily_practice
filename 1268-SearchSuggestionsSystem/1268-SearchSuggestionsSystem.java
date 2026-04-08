// Last updated: 4/8/2026, 9:42:48 PM
1class Solution {
2public List<List<String>> suggestedProducts(String[] products, String searchWord) {
3  PriorityQueue<String> pq = new PriorityQueue<>(3, (s1,s2) -> s1.compareTo(s2)); 
4  List<List<String>> list = new ArrayList<>();
5  
6  for(int i = 1; i<=searchWord.length(); i++){
7    String temp = searchWord.substring(0, i);
8    for(String s : products){
9      if(s.startsWith(temp)){
10        pq.offer(s);
11      }
12    }
13    List<String> temp_list = new ArrayList<>();
14    for(int j = 0; j<3; j++){
15      if(pq.peek() != null){
16        temp_list.add(pq.poll());
17      }
18    }
19    pq.clear();
20    list.add(temp_list);
21  }
22  return list;
23  }
24}