
package jobsheet13;

public class mahasiswa {
     Node head;
    int size,tampung;
    public mahasiswa(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(String nama,int nilai) {
        if (isEmpty()) {
            head = new Node (null,nama,nilai,null);
        } else {
            Node newNode = new Node(null,nama,nilai,head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    public void addLast(String nama, int nilai){
        if (isEmpty()) {
            addFirst(nama,nilai);
        } else {
            Node current = head;
            while (current.next!=null){
                current=current.next;
            }
            Node newNode=new Node (current,nama,nilai,null);
            current.next=newNode;
            size++;
        }
    }
   public void add(String nama, int nilai,int index) {
        if (isEmpty()) {
            addFirst(nama,nilai);

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
                Node newNode = new Node(null, nama,nilai, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nama,nilai, current);
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
                System.out.print(tmp.nama + "\t");
                System.out.print(tmp.nilai + "\t");
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
   
    public void get(String cari){
        
        Node tmp = head;
        int index=-1;
        for (int i = 0; i < size ;i++) {
            if (tmp.nama.equalsIgnoreCase(cari)) {
                index=i;
                System.out.println("Data "+cari+" ada di index ke-"+index);
                break;
            }
            tmp=tmp.next;
        }
        if(isEmpty()){
            System.out.println("Kosong");
        } 
}
    public void sort() {
        Node tmp = head;
        int index = size;
        int[] tampung = new int[index];
        for (int i = 0; i < size; i++) {
            tampung[i] = (int) tmp.nilai;
            tmp = tmp.next;
        }
        int tam;
        for (int i = 0; i < size; i++) {
            int x = i;
            for (int j = i; j < size; j++) {
                if (tampung[x] > tampung[j]) {
                    x = j;
                }
            }
            tam = tampung[i];
            tampung[i] = tampung[x];
            tampung[x] = tam;
        }        
        clear();
        for (int i = 0; i < index; i++) {
            addLast(tampung[i]);
        }
    }   

    
}
