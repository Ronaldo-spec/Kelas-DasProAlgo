
package arraymultidimensi;

public class diagonal1 {
 public static void main(String[] args) {
    int[][] matriksDiagonal = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        for(int g=3; g>0; g--){
            for(int h=3; h>0; h--){
                if(g==h){
                    System.out.println(matriksDiagonal[g][h]);
                }
            }
        }
    }
}