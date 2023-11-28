import java.util.HashMap;

class Solution {
    /**
     * Returns a deep copy of the given linked list.
     *
     * @param head The head node of the linked list to be copied
     * @return The head node of the deep-copied linked list
     */
    public Node copyRandomList(Node head) {
        Node temp = head;
        HashMap<Node, Node> map = new HashMap<>();

        // Mapping original nodes to their copies in the HashMap
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;

        // Updating the 'next' and 'random' pointers of the copied list
        while (temp != null) {
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);

            temp = temp.next;
        }

        // Returning the head node of the copied linked list
        return map.get(head);
    }
}