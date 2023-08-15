
package minggu8;

public class nomor2 {
    public String data[];
    public int size,top;
    public nomor2 (int size) {
        this.size=size;
        data=new String[size];
        top=-1;
    }
    public boolean isEmpty(){
        if (top==-1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull (){
        if (top==size-1) {
            return true;
        } else {
            return false;
        }
    }
    public void push (String dt){
        if (isFull()) {
            top++;
            data[top]=dt;
        } else {
            System.out.println("Stack Penuh");
        }
    }
    public void pop (){
        if (!isEmpty()) {
            String x=data[top];
            top--;
            System.out.println("Data yang keluar: "+x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen Teratas: "+data[top]);
    }
    public void print(){
        System.out.println("isi Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]+" ");
        }
        System.out.println("");
    }
    public void clear (){
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah kosong");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}


