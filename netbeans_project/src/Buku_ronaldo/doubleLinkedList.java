
package Buku_ronaldo;

public class doubleLinkedList {
    Node head;
    int size;
    public doubleLinkedList(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(int kode,String judul,String penerbit,int stok,int rusak) {
        if (isEmpty()) {
            head = new Node (null,kode,judul,penerbit,stok,rusak,null);
        } else {
            Node newNode = new Node(null,kode,judul,penerbit,stok,rusak,head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    public int get(int cari){
        
        Node tmp = head;
        int index=-1;
        for (int i = 0; i < size ;i++) {
            if ((int)tmp.kode==cari) {
                index=i;
                System.out.println("Buku dengan kode "+cari+" ada di index ke-"+index);
                break;
            }
            tmp=tmp.next;
        }
        if(isEmpty()){
            System.out.println("Kosong");
            return 0;
        } else {
            return index;
        }
}
    public void add(int kode,String judul,String penerbit,int stok,int rusak, int index) {
        if (isEmpty()) {
            addFirst(kode,judul,penerbit,stok,rusak);

        } else if (index < 0 || index > size) {
            System.out.println("Nilai index diluar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, kode,judul,penerbit,stok,rusak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, kode,judul,penerbit,stok,rusak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }
    public void clear(){
        head=null;
        size=0;
    }
   public void print() {
        if (!isEmpty()) {
            Node tmp = head;

            while (tmp != null) {
                System.out.println("JUDUL\t\t\tPenerbit\t\t\tStok\t\t\tRusak");
                System.out.print(tmp.judul+"\t\t\t"+tmp.penerbit+"\t\t\t"+tmp.stok+"\t\t\t"+tmp.rusak);
                tmp = tmp.next;
            }
            System.out.println("");
            System.out.println("Berhasil diisi");
        } else {
            System.out.println("Data Kosong");
        }
    }
   public void removeFirst(){
        if (isEmpty()) {
             System.out.println("Data masih kosong");
            
        } else if(size==1){
            removeLast();
        } else {
            head=head.next;
            head.prev=null;
            size--;
    }
}
    public void removeLast() {
       if (isEmpty()) {
           System.out.println("Data masih kosong");
           
       } else if (head.next==null) {
           head=null;
           size--;
           return;
       }
       Node current=head;
       while (current.next.next!=null){
           current = current.next;
       }
       current.next=null;
       size--;
   }
   public void remove(int index){
       if (isEmpty()||index>=size) {
            System.out.println("Data masih kosong");
           
       } else if(index==0) {
           removeFirst();
       }else{
           Node current=head;
           int i=0;
           while (i<index){
               current=current.next;
               i++;
           }
           if (current.next==null) {
               current.prev.next=null;
           } else if(current.prev==null){
               current = current.next;
               current.prev=null;
               head=current;
           } else {
               current.prev.next=current.next;
               current.next.prev=current.prev;
           }
           size--;
       }
   }

   
}
