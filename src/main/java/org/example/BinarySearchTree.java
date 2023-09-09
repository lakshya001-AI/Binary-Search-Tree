package org.example;

public class BinarySearchTree {

    //In the Binary search tree the Node contains the value , left and right pointer

    class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

    }
    private Node root;

    //So, in the BST we mainly perform two operations insert and contain

    //Insert operation is used to insert the Node into the tree

    public boolean insert(int value){
        Node newnode = new Node(value);
        if(root == null){
            System.out.println("Root was null, root = newnode");
            root = newnode;
            return true;
        }
        Node temp = root;
        while (true){
            if(newnode.value == temp.value){
                System.out.println("This node already exist in the tree");
                return false;
            }
            if(newnode.value < temp.value){
                if(temp.left == null){
                    System.out.println("Inserted at left!");
                    temp.left = newnode;
                    return true;
                }
                System.out.println("Moved to left");
                temp = temp.left;
            }
            else {
                if (temp.right == null){
                    System.out.println("Inserted at Right!");
                    temp.right = newnode;
                    return true;
                }
                System.out.println("Moved to Right");
                temp = temp.right;
            }
        }
    }

    public boolean contain(int value){
        if(root == null){
            System.out.println("Root is null , please insert some value");
            return false;
        }
        Node temp = root;
        while (temp != null){
            if(value < temp.value){
                System.out.println("Shifted to left");
                temp = temp.left;
            } else if (value > temp.value) {
                System.out.println("Shifted to right");
                temp = temp.right;
            }
            else {
                System.out.println("Found the Value");
                return true;
            }
        }
        System.out.println("The Given value is not present in the tree");
        return false;
    }

}
