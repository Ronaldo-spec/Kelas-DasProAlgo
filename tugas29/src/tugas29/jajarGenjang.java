
package tugas29;

public class jajarGenjang {
    public int tinggi;
    public int panjang;
    public int sisiMiring;
    public jajarGenjang (int t,int p, int sm){
        tinggi=t;
        panjang=p;
        sisiMiring=sm;
    }
    public int hitungLuas(){
        return tinggi*panjang;
    }
public int hitungKeliling(){
    return 2*(sisiMiring+panjang);
}    
}
