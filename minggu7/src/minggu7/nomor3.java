
package minggu7;

public class nomor3 {
      public int[]data;
    public int jumData;
    public nomor3(int[]Data, int jmlData){
        this.jumData=jmlData;
        data=new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i]=Data[i];
        }
    }

    
     public void tampilData(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
 
 public void tampilPosisi(int x, int pos){
        if (pos!=-1) {
            System.out.println("data: "+x+" ditemukan pada index"+pos);
        } else {
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
 
}
