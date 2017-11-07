/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

    }

    private ListNode sort(ListNode left,ListNode right,int n){
        ListNode cur=new ListNode(0);
        ListNode head=cur;
        int i=0,j=0;
        while (i<n||j<n){
            if (i==n){
                cur.next=right;
                right=right.next;
                left=left.next;
                j++;
            }
            else if (j==n){
                cur.next=left;
                i++;
            }
        }
    }
}