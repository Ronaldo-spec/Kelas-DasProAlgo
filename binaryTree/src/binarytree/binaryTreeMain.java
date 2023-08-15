package binarytree;

import java.util.Scanner;

public class binaryTreeMain {

    static int data;

    public static void main(String[] args) {
        Scanner ronaldo = new Scanner(System.in);
        binaryTree bt = new binaryTree();
        boolean ulang = true;
        while (ulang) {
            System.out.println("===MENU===");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Find");
            System.out.println("4. Traverse inOrder");
            System.out.println("5. Traverse preOrder");
            System.out.println("6. Traverse postOrder");
            System.out.println("7. Exit");
            int pilih = ronaldo.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data yang ditambahkan: ");
                    data = ronaldo.nextInt();
                    bt.add(data);
                    break;
                case 2:
                    System.out.print("Masukkan data yang dihapus: ");
                    bt.delete(data);
                    break;
                case 3:
                    System.out.print("Masukkan data yang dicari: ");
                    bt.find(data);
                    break;
                case 4:
                    bt.traverseInOrder(bt.root);
                    break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    break;
                case 7:
                    ulang = false;
            }

        }
    }
}
