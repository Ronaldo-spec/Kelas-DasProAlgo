
package doublelinkedlist;

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
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node (null,item,null);
        } else {
            Node newNode = new Node(null,item,head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    public void addLast(int item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next!=null){
                current=current.next;
            }
            Node newNode=new Node (current,item,null);
            current.next=newNode;
            size++;
        }
    }
   public void add(int item, int index) {
        if (isEmpty()) {
            addFirst(item);

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
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
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
                System.out.print(tmp.data + "\t");
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
   public int getFirst(){
        if(isEmpty()){
            System.out.println("LinkedList Kosong");
        } 
        return head.data;
    }
    public int getLast(){
        if(isEmpty()){
            System.out.println("Kosong");
        } 
        Node tmp =head ;
        
        while(tmp.next != null){
           tmp = tmp.next; 
        }
        return tmp.data;
       
    }
    public int get(int cari){
        
        Node tmp = head;
        int index=-1;
        for (int i = 0; i < size ;i++) {
            if ((int)tmp.data==cari) {
                index=i;
                System.out.println("Data "+cari+" ada di index ke-"+index);
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
    public void sort() {
        Node tmp = head;
        int index = size;
        int[] tampung = new int[index];
        for (int i = 0; i < size; i++) {
            tampung[i] = (int) tmp.data;
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