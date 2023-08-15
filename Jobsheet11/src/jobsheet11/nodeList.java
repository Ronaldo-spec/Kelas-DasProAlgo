package jobsheet11;
import java.util.Scanner;
public class nodeList<T> {
static Scanner ronaldo = new Scanner(System.in);
    Node<T> nama;
    Node<T> pesanan;
    Node<T> nomor;
    int size;

    public nodeList() {
        nama = null;
        pesanan = null;
        nomor=null;
        size = 0;
    }
    public boolean isEmpty() {
        return nama == null;
    }

    public boolean same(char x, char y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(T NAMA,T PESANAN, T NOMOR) {
        nama = new Node(NAMA, nama);
        pesanan = new Node(PESANAN, pesanan);
        nomor = new Node (NOMOR, nomor);
        size++;
    }

    public void removeFirst() {
        nama = nama.next;
        pesanan = pesanan.next;
        nomor=nomor.next;
        size--;
    }
public void ulang(){
    int jml=1;
    System.out.print("Masukkan jenis pesanan yang dicari: ");
    String cari = ronaldo.next();
    if (cari.equalsIgnoreCase((String) pesanan.data)) {
        jml++;
    } 
    System.out.println("Jumlah Pesanan tersebut adalah: "+jml);
}
    public void clear() {
        nama = null;
        pesanan = null;
        nomor=null;
        size = 0;
    }

    public void addByByValue(T NAMA, T PESANAN,T NOMOR) throws Exception {
        Node<T> tmp = nama;
        int index = -1;
        if (isEmpty()) {
            addFirst(NAMA, PESANAN,NOMOR);
        } else {
            for (int i = 0; i < size; i++) {
                String x = (String) tmp.data;
                String y = (String) NAMA;
                if (x.charAt(0) == y.charAt(0)) {
                    for (int j = 0; same(x.charAt(j), y.charAt(j)) == true; j++) {
                        if (same(x.charAt(j + 1), y.charAt(j + 1)) == false) {
                            if (x.charAt(j + 1) < y.charAt(j + 1)) {
                                index = i;
                                break;
                            } else {
                                index = i - 1;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    index = size;
                }
                tmp = tmp.next;
            }
            if (index < -1 || index > size) {
                throw new Exception("Nilai index Diluar Batas");
            } else {
                if (index == -1) {
                    addFirst(NAMA, PESANAN,NOMOR);
                } else {
                    Node<T> tmp1 = nama;
                    Node<T> tmp2 = pesanan;
                    Node<T> tmp3=nomor;
                    for (int i = 1; i < index; i++) {
                        tmp1 = tmp1.next;
                        tmp2 = tmp2.next;
                        tmp3=tmp3.next;
                    }
                    Node<T> skip1 = null;
                    Node<T> skip2 = null;
                    Node<T> skip3=null;
                    if (tmp1 == null) {
                        skip1 = null;
                        skip2 = null;
                        skip3=null;
                    } else {
                        skip1 = tmp1.next;
                        skip2 = tmp2.next;
                        skip3=tmp3.next;
                    }
                    tmp1.next = new Node(NAMA, skip1);
                    tmp2.next = new Node(PESANAN, skip2);
                    tmp3.next=new Node (NOMOR,skip3);
                    size++;
                }
            }
        }
    }

    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Masih Kosong");
        } else {
            System.out.println(nomor.data+"\t\t"+nama.data+"\t\t"+pesanan.data);
        }
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            Node<T> tara1 = nama;
            Node<T> tara2 = pesanan;
            Node<T> tara3= nomor;
            while (tara1.next != null) {
                tara1 = tara1.next;
                tara2 = tara2.next;
                tara3=tara3.next;
            }
            System.out.println(tara3.data+"\t\t" + tara1.data+"\t\t"+tara2.data);
        }
    }

    public void get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Diluat Batas");
        }
        Node<T> tara1 = nama;
        Node<T> tara2 = pesanan;
        Node<T> tara3=nomor;
        for (int i = 0; i < index; i++) {
            tara1 = tara1.next;
            tara2 = tara2.next;
            tara3=tara3.next;
        }
        System.out.println(tara3.data+"\t\t" + tara1.data+"\t\t"+tara2.data);
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Diluat Batas");
        } else {
            if (index == 0) {
                removeFirst();
            } else {
                Node<T> prev1 = nama;
                Node<T> prev2 = pesanan;
                Node<T> prev3=nomor;
                Node<T> curr1 = nama.next;
                Node<T> curr2 = pesanan.next;
                Node<T>curr3=nomor.next;
                for (int i = 1; i < index; i++) {
                    prev1 = curr1;
                    prev2 = curr2;
                    prev3=curr3;
                    curr1 = prev1.next;
                    curr2 = prev2.next;
                    curr3=prev3.next;
                }
                prev1.next = curr1.next;
                prev2.next = curr2.next;
                prev3.next=curr3.next;
                size--;
            }
        }
    }

    public void removeByValue(T value) throws Exception {
        Node<T> tara = nama;
        int index = -1;
        for (int i = 0; i < size; i++) {
            String x = (String) tara.data;
            String y = (String) value;
            if (x.equalsIgnoreCase(y)) {
                index = i;
                break;
            }
            tara = tara.next;
        }
        if (index == -1) {
            throw new Exception("Nilai Tidak Ada");
        } else {
            if (index == 0) {
                removeFirst();
            } else {
                remove(index);
            }
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node<T> tara1 = nama;
            Node<T> tara2 = pesanan;
            Node<T> tara3= nomor;
            System.out.println("NOMOR ANTRIAN\t\tNAMA PELANGGAN\t\tPESANAN");
            while (tara1 != null) {
                System.out.print(tara3.data+"\t\t\t"+tara1.data+"\t\t\t"+tara2.data);
                tara1 = tara1.next;
                tara2 = tara2.next;
                tara3=tara3.next;
                System.out.println("");
            }
        } else {
            System.out.println("Data Kosong");
        }
    }
    
}
