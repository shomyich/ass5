public class Main {
    public static void main(String[] args) {
        // Create a binary search tree
        BST<Integer, Integer> bst = new BST<>();

        // Insert key-value pairs into the tree
        bst.put(5, 10);
        bst.put(2, 20);
        bst.put(8, 30);
        bst.put(1, 40);
        bst.put(4, 50);
        bst.put(7, 60);

        // Print the keys using the iterator
        System.out.println("Keys in the binary search tree:");
        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }

        // Get the value for a specific key
        int searchKey = 4;
        int value = bst.get(searchKey);
        System.out.println("Value for key " + searchKey + ": " + value);

        // Delete a node with a specific key
        int deleteKey = 2;
        bst.delete(deleteKey);
        System.out.println("Deleted key: " + deleteKey);

        // Print the keys again after deletion
        System.out.println("Keys in the binary search tree after deletion:");
        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }


    }
}