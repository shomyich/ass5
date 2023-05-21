## Binary Search Tree (BST)
The Binary Search Tree (BST) is a data structure that allows efficient insertion, deletion, and retrieval of key-value pairs. It is implemented using a binary tree, where each node has a key and a corresponding value. The keys in the left subtree of a node are smaller than its key, while the keys in the right subtree are greater.

## Class:
BST<K extends Comparable<K>, V>
This class represents the Binary Search Tree. It supports operations such as inserting key-value pairs, retrieving values by key, deleting nodes by key, and iterating over the keys in ascending order.

## Constructor
BST(): Creates an empty Binary Search Tree.
## Methods
**put(K key, V val):** 

Inserts a key-value pair into the tree. If the key already exists, the value is updated.

**get(K key):** 

Retrieves the value associated with the given key. Returns null if the key is not found.

**delete(K key):**

Deletes the node with the specified key from the tree.

**iterator():** 

Returns an iterable collection of keys in ascending order.
## Private Inner Class: 
**Node**

This class represents a node in the Binary Search Tree. Each node has a key, a value, and references to its left and right child nodes.


## Constructor
Node(K key, V val): Creates a new node with the given key and value.