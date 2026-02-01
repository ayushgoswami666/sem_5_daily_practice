// Last updated: 2/1/2026, 2:19:48 PM
1class MyHashMap {
2
3    class Node {
4        int key;
5        int value;
6        Node next;
7
8        Node(int key, int value) {
9            this.key = key;
10            this.value = value;
11        }
12    }
13
14    private int size;
15    private int capacity;
16    private ArrayList<Node> buckets;
17
18    public MyHashMap() {
19        this.capacity = 4;
20        this.size = 0;
21        buckets = new ArrayList<>();
22        for (int i = 0; i < capacity; i++) {
23            buckets.add(null);
24        }
25    }
26
27    private int hashFun(int key) {
28        return key % capacity;
29    }
30
31    public void put(int key, int value) {
32        int idx = hashFun(key);
33        Node head = buckets.get(idx);
34
35        Node curr = head;
36        while (curr != null) {
37            if (curr.key == key) {
38                curr.value = value;
39                return;
40            }
41            curr = curr.next;
42        }
43
44        Node nn = new Node(key, value);
45        nn.next = head;
46        buckets.set(idx, nn);
47        size++;
48    }
49
50    public int get(int key) {
51        int idx = hashFun(key);
52        Node curr = buckets.get(idx);
53
54        while (curr != null) {
55            if (curr.key == key) {
56                return curr.value;
57            }
58            curr = curr.next;
59        }
60        return -1;
61    }
62
63    public void remove(int key) {
64        int idx = hashFun(key);
65        Node curr = buckets.get(idx);
66        Node prev = null;
67
68        while (curr != null) {
69            if (curr.key == key) {
70                break;
71            }
72            prev = curr;
73            curr = curr.next;
74        }
75
76        if (curr == null) return;
77
78        if (prev == null) {
79            buckets.set(idx, curr.next);
80        } else {
81            prev.next = curr.next;
82        }
83        size--;
84    }
85}
86