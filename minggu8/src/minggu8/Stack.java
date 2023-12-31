
package minggu8;

public class Stack {
    public int size,top;
    public String data[];
    public Stack (int size){
       this.size=size;
       data=new String[size];
       top=-1;
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(String dt){
        if (!isFull()) {
            top++;
            data[top]=dt;
        } else {
            System.out.println("Isi Stack Penuh");
        }
    }
    public void pop(){
        if (!isEmpty()) {
            String x = data[top];
            top--;
            System.out.println("Data yang keluar: "+x);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas: "+data[top]);
    }
    public void print(){
        System.out.println("Isi Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]+" ");
        }
        System.out.println("");
    }
    public void clear(){
        if (isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
