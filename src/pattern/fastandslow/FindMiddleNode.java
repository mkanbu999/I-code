package pattern.fastandslow;

public class FindMiddleNode {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        var node = ListNodeConstructor.createLinkedList(array);
        ListNode middleNode = FindMiddleNode.findMiddleNode(node);
        System.out.println("************" + middleNode.val);
    }

    private static ListNode findMiddleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
