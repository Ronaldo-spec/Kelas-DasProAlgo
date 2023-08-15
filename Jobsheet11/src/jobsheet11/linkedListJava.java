
package jobsheet11;

public class linkedListJava {
nodeJava head;
int size;
public linkedListJava(){
    head=null;
    size=0;
}
public boolean kosong(){
    return head == null;
}
public void addFrist(int item){
    head = new nodeJava(item,head);
    size++;
}
public void add(int item,int index)throws Exception{
    if (index<0||index>size) {
        throw new Exception("Nilai di luar batas");
    }
    if (kosong()||index==0) {
        addFrist(item);
    }
    else {
        nodeJava tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        nodeJava next=(tmp==null)?null:tmp.next;
        tmp.next=new nodeJava(item, next);
    }
    size++;
}
public void addLast (int item){
    if (kosong()) {
        System.out.println("Masih Kosong");
    } else {
        nodeJava tmp = head;
        while(tmp.next!=null){
        tmp=tmp.next;
    }
        tmp.next=new nodeJava(item, null);
    }
    size++;
}
public int getFirst()throws Exception{
    if (kosong()) {
        throw new Exception("Linked List Kosong");
    }
    return (int) head.data;
}
public int getLast()throws Exception{
    if (kosong()) {
        throw new Exception("Linked List Kosong");
    }
    nodeJava tmp = head;
    while (tmp.next!=null){
        tmp=tmp.next;
    }
    return (int)tmp.data;
}
public int get(int index)throws Exception{
    if (kosong()||index>=size) {
        throw new Exception("Nilai index di luat Batas");
    }
    nodeJava tmp=head;
    for (int i = 0; i < index; i++) {
        tmp=tmp.next;
    }
    return(int) tmp.data;
}
public void remove(int index)throws Exception{
    if (kosong()||index>=size) {
        throw new Exception("Nilai index di luat Batas");
    } else if (index==0){
        removeFirst();
    } else {
        nodeJava prev=head;
        nodeJava curr=head.next;
        for (int i = 0; i < index; i++) {
            prev=curr;
            curr=prev.next;
        }
        prev.next=curr.next;
        size--;
    
    }
}
public void removeFirst()throws Exception{
    head=head.next;
    size--;
}
public void clear(){
    head=null;
    size=0;
}
public void print(){
    if (!kosong()) {
        nodeJava tmp=head;
        while(tmp!=null){
            System.out.println(tmp.data+" \t");
            tmp=tmp.next;
        }
        System.out.println("");
    } else {
        System.out.println("Linked List Kosong");
    }
}
public void addByValue(int tambah)throws Exception{
    nodeJava tmp=head;
    int index=-1;
    for (int i = 0; i < size; i++) {
        if ((int)tmp.data==tambah) {
            index=i;
            
        }
        tmp=tmp.next;
    }
    if (index==-1) {
        throw new Exception("Nilai tidak ada");
    } else {
        if (index==0) {
            removeFirst();
        } else {
            nodeJava prev=head;
            nodeJava curr=head.next;
            for (int i = 0; i < 10; i++) {
                prev=curr;
                curr=prev.next;
            }
            prev.next=curr.next;
            size--;
        }
    }
}
}