
package minggu7;

public class nomor2 {
    public int [][]data;
    public int baris,kolom,Baris,Kolom;
    public nomor2(int[][]Data,int jumBaris, int jumKolom){
        
        this.baris=jumBaris;
        this.kolom=jumKolom;
        data=new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                data[i][j]=Data[i][j];
            }
        }
        
        }
      
        public int sequential(int cari){
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
            if (data[j][i]==cari) {
                Baris=j;
                break;
            }
            
        }
        }
        return Baris;
    }
     public int sequential1(char cari){
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
            if (data[j][i]==cari) {
                Kolom=i;
                break;
            }
            
        }
        }
        return Kolom;
    }   
        public void tampilData(){
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(data[i][j]+" ");
                }
                System.out.println("");
            }
        }

   
        
    }
   
