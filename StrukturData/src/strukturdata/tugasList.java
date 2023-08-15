
package strukturdata;

public class tugasList<T> {
tugas<T> nama;
tugas<T> nim;
tugas<T> alamat;
int size;
public tugasList(){
    nama=null;
    nim=null;
    alamat=null;
    size=0;
}
public boolean isEmpty(){
    return nama==null;
}
public boolean same(char x,char y){
    if (x==y) {
        return true;
    } else {
        return false;
    }
}
public void addFirst(T NAMA,T NIM,T ALAMAT){
    nama=new tugas(NAMA,nama);
    nim = new tugas(NAMA, nim);
    alamat=new tugas(ALAMAT, alamat);
    size++;
}
public void removeFirst(){
    nama=nama.next;
    nim=nim.next;
    alamat=alamat.next;
    size--;
}
public void clear(){
    nama=null;
    nim=null;
    alamat=null;
    size=0;
}

public void addByByValue(T NAMA,T NIM, T ALAMAT)throws Exception{
    tugas<T> tmp=nama;
    int index=-1;
    if (isEmpty()) {
        addFirst(NAMA, NIM, ALAMAT);
    } else {
        for (int i = 0; i < size; i++) {
            String x=(String)tmp.data;
            String y=(String)NAMA;
            if (x.charAt(0)==y.charAt(0)) {
                for (int j = 0; same(x.charAt(j),y.charAt(j)) == true; j++) {
                    if (same(x.charAt(j+1),y.charAt(j+1))==false) {
                        if (x.charAt(j+1)<y.charAt(j+1)) {
                            index=i;
                            break;
                        } else {
                            index=i-1;
                            break;
                        }
                    }
                }
                break;
            } else {
                index=size;
            }
            tmp=tmp.next;
        } if (index<-1||index>size) {
            throw new Exception("Nilai index Diluar Batas");
        }else{
            if (index==-1) {
                addFirst(NAMA, NIM, ALAMAT);
        } else {
                tugas<T> tmp1=nama;
                tugas<T> tmp2=nim;
                tugas<T> tmp3=alamat;
                for (int i = 1; i < index; i++) {
                    tmp1=tmp1.next;
                    tmp2=tmp2.next;
                    tmp3=tmp3.next;
                }
                tugas<T> skip1=null;
                tugas<T> skip2=null;
                tugas<T> skip3=null;
                if (tmp1==null) {
                    skip1=null;
                            skip2=null;
                            skip3=null;
                } else {
                    skip1=tmp.next;
                            skip2=tmp.next;
                            skip3=tmp1.next;
                }
                tmp1.next=new tugas(NAMA,skip1);
                tmp2.next=new tugas(NIM, skip2);
                tmp3.next=new tugas(ALAMAT, skip3);
                size++;
        }
        }
    }
}
public void getFirst()throws Exception{
    if (isEmpty()) {
        throw new Exception("Antrian Masih Kosong");
    } else {
        System.out.println("Nama: "+nama.data);
        System.out.println("NIM: "+nim.data);
        System.out.println("Alamat: "+alamat.data);
    }
}
public void getLast()throws Exception{
    if (isEmpty()) {
        System.out.println("Antrian Masih Kosong");
    } else {
        tugas<T> tara1=nama;
        tugas<T> tara2=nim;
        tugas<T> tara3=alamat;
        while(tara1.next!=null){
            tara1=tara1.next;
            tara2=tara2.next;
            tara3=tara3.next;
        }
        System.out.println("Nama: "+tara1.data);
        System.out.println("NIM: "+tara2.data);
        System.out.println("Alamat: "+tara3.data);
    }
}
public void get(int index)throws Exception{
    if (isEmpty()||index>=size) {
        throw new Exception("Nilai Diluat Batas");
    }
    tugas<T> tara1=nama;
    tugas<T> tara2=nim;
    tugas<T> tara3=alamat;
    for (int i = 0; i < index; i++) {
        tara1=tara1.next;
        tara2=tara2.next;
        tara3=tara3.next;
    }
    System.out.println("Nama: "+tara1.data);
    System.out.println("NIM: "+tara2.data);
    System.out.println("Alamat: "+tara3.data);
}

public void remove (int index)throws Exception{
    if (isEmpty()||index>=size) {
        throw new Exception("Nilai Diluat Batas");
    } else {
        if (index==0) {
            removeFirst();
        } else {
            tugas<T> prev1=nama;
            tugas<T> prev2=nim;
            tugas<T> prev3 = alamat;
            tugas<T> curr1=nama.next;
            tugas<T> curr2=nim.next;
            tugas<T> curr3=alamat.next;
            for (int i = 1; i < index; i++) {
                prev1=curr1;
                 prev2=curr2;
                  prev3=curr3;
                  curr1=prev1.next;
                  curr2=prev2.next;
                  curr3=prev3.next;
            }
            prev1.next=curr1.next;
            prev2.next=curr2.next;
            prev3.next=curr3.next;
            size--;
        }
    }
}
public void removeByValue(T value)throws Exception{
    tugas<T> tara=nama;
    int index=-1;
    for (int i = 0; i < size; i++) {
        String x=(String)tara.data;
        String y=(String)value;
        if (x.equalsIgnoreCase(y)) {
            index=i;
            break;
        }
        tara=tara.next;
    }
    if (index==-1) {
        throw new Exception("Nilai Tidak Ada");
    } else {
        if (index==0) {
            removeFirst();
        } else {
            remove(index);
        }
    }
}
public void print(){
    if (!isEmpty()) {
        tugas<T> tara1=nama;
        tugas<T> tara2=nim;
        tugas<T> tara3=alamat;
        while(tara1!=null){
            System.out.println(tara1.data);
            System.out.println(tara2.data);
            System.out.println(tara3.data);
            tara1=tara1.next;
            tara2=tara2.next;
            tara3=tara3.next;
            System.out.println("==============");
        }
        System.out.println("");
    } else {
        System.out.println("Data Kosong");
    }
}
}
