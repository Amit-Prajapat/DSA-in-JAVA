/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int len = 0;
        // List<Integer> arr = new ArrayList<>();
        while(temp!=null){
            // int value = temp.val;
            // arr.add(value);
            temp = temp.next;
            len++;
        }
        temp = head;
        int[] arr = new int[len];
        int k=0;
        while(temp!=null){
            arr[k] = temp.val;
            temp = temp.next;
            k++;
        }
        int val1 = Integer.MIN_VALUE;
        int val2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            val2 = arr[i]+arr[len-1-i];
            val1 = Math.max(val1,val2);
        }
        return val1;
    }
}