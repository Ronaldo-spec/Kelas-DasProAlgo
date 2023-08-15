
package Buku_ronaldo;

public class Node {
    String judul,penerbit;
    int stok,rusak,kode;
    Node prev;
    Node next;
    Node(Node prev,int kode,String judul,String penerbit,int stok,int rusak,Node next){
        this.prev=prev;
        this.kode=kode;
        this.judul=judul;
        this.penerbit=penerbit;
        this.stok=stok;
        this.rusak=rusak;
        this.next=next;
    }

    
}
