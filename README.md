# Binary Search Tree (BST) in Java

This is a Java implementation of a Binary Search Tree (BST) data structure that supports two primary operations: `insert` and `contains`. A Binary Search Tree is a data structure that allows for efficient searching, insertion, and deletion of elements.

## Table of Contents

- [Getting Started](#getting-started)
- [Usage](#usage)
- [Methods](#methods)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To use this Binary Search Tree in your Java project, you can clone this repository or download the `BinarySearchTree.java` file and include it in your project. Here's how you can clone the repository:

```bash
git clone https://github.com/your-username/binary-search-tree-java.git
```

## Usage

To create a Binary Search Tree and use it in your Java code, follow these steps:

1. Import the `BinarySearchTree` class:

```java
import java.util.*;

public class YourClass {
    public static void main(String[] args) {
        // Create a BinarySearchTree object
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Insert elements into the tree
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        
        // Check if an element is in the tree
        boolean containsElement = bst.contains(5);
        System.out.println("Contains 5: " + containsElement);
    }
}
```

## Methods

### `insert(T data)`

Inserts an element of type `T` into the Binary Search Tree.

```java
BinarySearchTree<Integer> bst = new BinarySearchTree<>();
bst.insert(10);
```

### `contains(T data)`

Checks if an element of type `T` is present in the Binary Search Tree. Returns `true` if the element is found, `false` otherwise.

```java
boolean containsElement = bst.contains(10);
```

## Example

Here's a more comprehensive example of how to use the Binary Search Tree:

```java
import java.util.*;

public class BinarySearchTreeExample {
    public static void main(String[] args) {
        // Create a BinarySearchTree object
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Insert elements into the tree
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        // Check if elements are in the tree
        boolean containsElement1 = bst.contains(5);
        boolean containsElement2 = bst.contains(8);

        System.out.println("Contains 5: " + containsElement1);
        System.out.println("Contains 8: " + containsElement2);
    }
}
```

## Contributing

Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please open an issue or create a pull request.

## License

This Binary Search Tree project is licensed under the [MIT License](LICENSE).
