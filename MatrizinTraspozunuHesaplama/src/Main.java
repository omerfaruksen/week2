import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Matrisimizin satır sutun ve elemanlarını kullanıcıdan aldık.
        Scanner info=new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz : ");
        int i=info.nextInt();
        System.out.print("Matrisin sutun sayısını giriniz : ");
        int j= info.nextInt();
        //Matrisimizi kullanıcıdan aldığımız veriler ile oluşturduk.
        int [][]matris=new int[i][j];



        for (i=0;i< matris.length;i++){
            for (j=0; j<matris[i].length; j++){
                System.out.print((i+1)+" . elamanı giriniz : ");
                matris[i][j]= info.nextInt();
            }
        }
        //Matrisi Ekrana bastırdık
        System.out.println("Matris;");
        for (int[] row: matris){
            for (int col:row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        //transpoz adlı yeni bir dizi oluşturduk ve matirisimizin satır sutun bilgilerini ters olarak işledik
        int a=j , b=i;
        int [][] transpoz=new int[a][b];
        //Matrisin elemanlarını trenspoza yerleştirdik.
        for (i = 0; i < matris.length; i++) {
            for (j = 0; j < matris[i].length; j++) {
                if (i == j) {
                    transpoz[i][j] = matris[i][j];
                } else {
                    transpoz[j][i] = matris[i][j];
                }
            }
        }
        //Ekrana bastırdık
        System.out.println("Matrisin Transpozu;");

        for (int[] row:transpoz){
            for (int col: row){
                System.out.print(col+ " ");

            }
            System.out.println();
        }

    }
}