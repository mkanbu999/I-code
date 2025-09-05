package pattern.fastandslow;

public class ListNodeConstructor {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        ListNode head = createLinkedList(values);

        ListNodeConstructor.printLinkedList(head);
    }
    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }
    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}
