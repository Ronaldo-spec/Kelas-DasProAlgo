
package strukturdata;

public class tugas<T> {
    T data;
    tugas<T> next;
    public tugas (T data, tugas<T>next){
        this.data=data;
        this.next=next;
       
    }
}
