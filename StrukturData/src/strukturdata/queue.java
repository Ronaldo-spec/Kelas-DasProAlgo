
package strukturdata;

public class queue {
    int max,size,front,rear;
    String Q[];
    public queue(int n){
        max=n;
        Create();
    }
    public void Create(){
        Q=new String[max];
        size=0;
        front = rear = -1;
    }
    public boolean isEmpty (){
        if (size==0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull (){
        if (size==max) {
            return true;
        } else {
            return false;
        }
    }
    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen Terdepan: "+Q[front]);
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("Elemen Paling Belakang: "+Q[rear]);
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            int i = front;
            while (i!=rear){
                System.out.println(Q[i]+" ");
                i = (i+1)%max;
            }
            System.out.println(Q[i]+" ");
            System.out.println("Jumlah Antrian: "+size);
        }
    }
    public void enqueue(String data){
        if (isFull()) {
            System.out.println("Antrian Sudah Penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max-1) {
                    rear=0;
                } else {
                    rear++;
                }
            }
            Q[rear]=data;
            size++;
        }
    }
    public String dequeue(){
        String data = null;
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            data= Q[front];
            size--;
            if (isEmpty()) {
                front=rear=-1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    public void peekPosition(String data){
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            int i = front,x=1;
            while (i !=rear){
                if (Q[i].equalsIgnoreCase(data)) {
                    System.out.println("Data "+data+" terletak di antrian: "+x);
                }
                x+=1;
                i=(i+1)%max;
            }
        }
    }
    public void peekAt(int posisi){
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            int i = front,x=1;
            while(i!=rear){
                if (x==posisi) {
                    System.out.println("Letak "+posisi+" terdapat di elemen ke"+Q[i]);
                x+=1;
                i=(i+1)%max;
            }
        }
    }
}
}
