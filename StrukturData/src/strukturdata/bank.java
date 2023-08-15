
package strukturdata;

public class bank {
public int max, size, front, rear;
public String []rekening;
public String[]nama;
public bank(int m){
    max=m;
    create();
}
public void create(){
        rekening=new String[max];
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
            System.out.println("No. Rekening terdepan adalah: "+rekening[front]);
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("No. Rekening paling belakang adalah: "+rekening[rear]);
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            int i = front;
            int j = front;
            while (i!=rear){
                System.out.println(rekening[i]+" ");
                i = (i+1)%max;
            }
            System.out.println(rekening[i]+" ");
            while (j!=rear){
                System.out.println(nama[j]+" ");
                j=(j+1)%max;
            }
            System.out.println(nama[j]+" ");
            System.out.println("Jumlah Antrian: "+size);
        }
    }
    public void enqueue(String Rekening, String Nama){
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
            rekening[rear]=Rekening;
            nama[rear]=Nama;
            size++;
        }
    }
    public String dequeue(){
        String data = "kosong";
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            data= rekening[front];
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
                if (rekening[i].equals(data)) {
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
                    System.out.println("Letak "+posisi+" terdapat di"+rekening[i]);
                    System.out.println("Nama Nasabah: "+nama[i]);
            }
                x+=1;
                i=(i+1)%max;
        }
    }
}
}
