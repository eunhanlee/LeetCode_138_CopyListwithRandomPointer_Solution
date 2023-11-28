import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void SolutionTest() {
        Solution solution = new Solution();

        Node head1 = null;
        assertEquals(null, solution.copyRandomList(head1));

        Node head2 = new Node(5);
        assertEquals(5, solution.copyRandomList(head2).val);

        Node head3 = new Node(1);
        head3.next = new Node(2);
        head3.next.next = new Node(3);
        head3.random = head3.next.next;
        head3.next.random = head3;
        head3.next.next.random = head3.next;
        assertEquals(1, solution.copyRandomList(head3).val);
        assertEquals(2, solution.copyRandomList(head3).next.val);
        assertEquals(3, solution.copyRandomList(head3).next.next.val);
        assertEquals(3, solution.copyRandomList(head3).random.val);
        assertEquals(1, solution.copyRandomList(head3).next.random.val);
        assertEquals(2, solution.copyRandomList(head3).next.next.random.val);

        Node head4 = new Node(10);
        head4.random = head4;
        assertEquals(10, solution.copyRandomList(head4).val);
        assertEquals(10, solution.copyRandomList(head4).random.val);

        Node head5 = new Node(999);
        head5.next = new Node(1000);
        head5.next.next = new Node(1001);
        assertEquals(999, solution.copyRandomList(head5).val);
        assertEquals(1000, solution.copyRandomList(head5).next.val);
        assertEquals(1001, solution.copyRandomList(head5).next.next.val);

        Node head6 = new Node(-1);
        head6.next = new Node(-2);
        head6.next.next = new Node(-3);
        head6.random = null;
        head6.next.random = null;
        head6.next.next.random = null;
        assertEquals(-1, solution.copyRandomList(head6).val);
        assertEquals(-2, solution.copyRandomList(head6).next.val);
        assertEquals(-3, solution.copyRandomList(head6).next.next.val);
        assertEquals(null, solution.copyRandomList(head6).random);
        assertEquals(null, solution.copyRandomList(head6).next.random);
        assertEquals(null, solution.copyRandomList(head6).next.next.random);


        System.out.println("All test cases passed.");
    }
}
