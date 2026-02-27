// Last updated: 2/27/2026, 10:51:54 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * Definition for a binary tree node.
13 * public class TreeNode {
14 *     int val;
15 *     TreeNode left;
16 *     TreeNode right;
17 *     TreeNode() {}
18 *     TreeNode(int val) { this.val = val; }
19 *     TreeNode(int val, TreeNode left, TreeNode right) {
20 *         this.val = val;
21 *         this.left = left;
22 *         this.right = right;
23 *     }
24 * }
25 */
26class Solution {
27
28    public TreeNode sortedListToBST(ListNode head) {
29        if (head == null) {
30            return null;
31        }
32
33        if (head.next == null) {
34            return new TreeNode(head.val);
35        }
36
37        ListNode prev = null;
38        ListNode slow = head;
39        ListNode fast = head;
40
41        // Find middle
42        while (fast != null && fast.next != null) {
43            prev = slow;
44            slow = slow.next;
45            fast = fast.next.next;
46        }
47
48        // Break left half
49        if (prev != null) {
50            prev.next = null;
51        }
52
53        ListNode midNext = slow.next;
54
55        TreeNode root = new TreeNode(slow.val);
56
57        // If slow == head, left should be null
58        if (head != slow) {
59            root.left = sortedListToBST(head);
60        }
61
62        root.right = sortedListToBST(midNext);
63
64        return root;
65    }
66}