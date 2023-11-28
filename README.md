### Homepage link

[Eunhan's blog](https://eunhanlee.hashnode.dev/)

## Problem

[Copy List with Random Pointer - LeetCode](https://leetcode.com/problems/copy-list-with-random-pointer/description)

### Problem Solving Approach

- The objective here is to create a copy of a given linked list, including the random pointers associated with each node.
- Thus, the code traverses the original linked list, creating a copy of each node and mapping the random and next pointers of each node in the copied list appropriately.

### Algorithm

1. Copy each node of the given linked list into a HashMap, mapping original nodes to their respective copied nodes.
2. Traverse the original list again and map the next and random pointers of each node in the copied list using the HashMap.
3. Finally, return the head of the copied list.

### Time Complexity

- This algorithm traverses the original list twice, hence the time complexity is O(N) where N is the number of nodes in the original list.

### Space Complexity

- Additional space is used for the HashMap to map original nodes to their copied nodes, resulting in a space complexity of O(N), where N is the number of nodes in the original list.