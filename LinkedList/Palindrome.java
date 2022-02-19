package LinkedList;

public class Palindrome {

    public ListNode reverse(ListNode head) {

        ListNode ans = new ListNode(head.val);

        head = head.next;

        while(head != null) {
            ListNode newNode = new ListNode(head.val);
            newNode.next = ans;
            ans = newNode;
            head = head.next;
        }
        return ans;

    }

    public boolean isPalindrome(ListNode head) {
        ListNode rev = reverse(head);

        while(head != null) {
            if(head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;

    }
}
