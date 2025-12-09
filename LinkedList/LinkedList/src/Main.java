public class Main {
    public static void main(String[] args) {

        // перший список
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        // другий список
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));

        Solution s = new Solution();
        ListNode merged = s.mergeTwoLists(list1, list2);

        printList(merged);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
