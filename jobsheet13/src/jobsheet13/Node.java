
package jobsheet13;

public class Node {
    int nilai;
    String nama;
    Node prev,next;
    Node(Node prev,String nama,int nilai,Node next){
        this.prev=prev;
        this.nama=nama;
        this.next=next;
        this.nilai=nilai;
    }

    
}
