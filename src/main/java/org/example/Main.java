package org.example;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree= new BinarySearchTree();
        System.out.println();
        System.out.println(binarySearchTree.insert(23));
        System.out.println();
        System.out.println(binarySearchTree.insert(20));
        System.out.println();
        System.out.println(binarySearchTree.insert(46));
        System.out.println();
        System.out.println(binarySearchTree.insert(89));
        System.out.println();
        System.out.println(binarySearchTree.insert(70));

        System.out.println();
        System.out.println("Searching for value 89");
        binarySearchTree.contain(89);

        System.out.println();
        System.out.println("Searching for value 70");
        binarySearchTree.contain(70);




    }
}