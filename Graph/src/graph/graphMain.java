package graph;

import java.util.Scanner;

public class graphMain {

    static int jumlah, nilai1, nilai2, x = -1;
    static boolean lanjut = true;

    public static void main(String[] args) throws Exception {
        Scanner ronaldo = new Scanner(System.in);
        Graph gr = new Graph();
        while (lanjut) {
            System.out.println("MENU");
            System.out.println("1. Jumlah Vertex");
            System.out.println("2. add Edge");
            System.out.println("3. Degree");
            System.out.println("4. Remove All");
            System.out.println("5. Remove Edge");
            System.out.println("6. Print Data");
            int pilih = ronaldo.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jumlah Graph: ");
                    jumlah = ronaldo.nextInt();
                    break;
                case 2:
                    System.out.print("Masukan vertex: ");
                    nilai1 = ronaldo.nextInt();
                    System.out.print("Terhubung dengan Destination: ");
                    nilai2 = ronaldo.nextInt();
                    if (nilai2 >= jumlah || nilai1 >= jumlah) {
                        System.out.println("vertex di luar index (dari 0 - " + (jumlah - 1) + ")");
                    } else {
                        gr.addEdge(nilai1, nilai2, x);
                    }
                    gr.printGraph();
                    break;
                case 3:
                    System.out.print("Masukkan angka Vertex: ");
                    nilai1 = ronaldo.nextInt();
                    gr.degree(nilai1);
                    break;
                case 4:
                    gr.removeAllEdge();
                    break;
                case 5:
                    System.out.print("Pada Vertex: ");
                    nilai1 = ronaldo.nextInt();
                    System.out.print("Pada Destination: ");
                    nilai2 = ronaldo.nextInt();
                    gr.removeEdge(nilai1, nilai2);
                    break;
                case 6:
                    gr.printGraph();
                    break;
                case 7:
                    lanjut = false;
            }
        }
    }

}
