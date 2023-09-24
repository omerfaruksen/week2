import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] sayi={10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate=new int [sayi.length];
        int startIndex=0;

        System.out.println(Arrays.toString(sayi));

        
        for (int i=0; i< sayi.length; i++){
            int sayac=0;
            for (int j=0; j< sayi.length; j++){
                if (sayi[i]==duplicate[j]){
                    sayac++;
                }
            }
            int sayac2=0;
            if (sayac==0){
                for (int k=0;k<sayi.length; k++){
                    if (sayi[i]==sayi[k]){
                        sayac2++;
                    }
                }
                duplicate[startIndex]=sayi[i];
                startIndex++;
                System.out.println(sayi[i] +" sayısı : "+sayac2 +" kere tekrar edildi.");
            }

        }

    }
}