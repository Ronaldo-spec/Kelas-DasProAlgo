
package arrayblok;
public class segitiga {
    public int alas;
    public int tinggi;
    public segitiga(int a,int t){
        alas=a;
        tinggi=t;
    }
    public int hitungLuas(){
        return alas*tinggi/2;
    }
    double hitungKeliling(){
        return Math.sqrt(Math.pow(alas, 2)+ Math.pow(tinggi,2));
    }
   
}
