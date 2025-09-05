package pattern.fastandslow;

public class IsCyclicNode {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        var node = ListNodeConstructor.createLinkedList(array);
//        node.next.next = node.next; to make cyclic
        System.out.println("************" +  IsCyclicNode.isCyclicNode(node));
    }

    private static boolean isCyclicNode(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while (slow != fast) {
            if(fast == null || fast.next ==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
