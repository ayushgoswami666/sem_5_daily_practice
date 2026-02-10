// Last updated: 2/11/2026, 12:09:09 AM
1class Solution {
2    public String replaceWords(List<String> dictionary, String sentence) {
3        Trie t = new Trie();
4		for (String s : dictionary) {
5			t.insert(s);
6		}
7		String[] arr = sentence.split(" ");
8		StringBuilder sb = new StringBuilder();
9		for (int i = 0; i < arr.length; i++) {
10			String get=t.search(arr[i]);
11			sb.append(get+" ");
12		}
13		return sb.toString().trim();
14        
15    }
16    static class Trie {
17		class Node {
18			char ch;
19			String isterminal;
20			HashMap<Character, Node> child;
21
22			public Node(char ch) {
23				// TODO Auto-generated constructor stub
24				this.ch = ch;
25				child = new HashMap<>();
26			}
27		}
28
29		private Node root = new Node('*');
30
31		public void insert(String word) {
32			Node curr = root;
33			for (int i = 0; i < word.length(); i++) {
34				char ch = word.charAt(i);
35				if (curr.child.containsKey(ch)) {
36					curr = curr.child.get(ch);
37				} else {
38					Node nn = new Node(ch);
39					curr.child.put(ch, nn);
40					curr = nn;
41				}
42			}
43			curr.isterminal = word;
44
45		}
46
47		public String search(String word) {
48			Node curr = root;
49			for (int i = 0; i < word.length(); i++) {
50				char ch =word.charAt(i);
51				if(curr.child.containsKey(ch)) {
52					curr=curr.child.get(ch);
53					if(curr.isterminal!=null) {
54						return curr.isterminal;
55					}
56				}
57				else {
58					return word;
59				}
60			}
61			return word;
62		}
63	}
64}