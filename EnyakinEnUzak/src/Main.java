import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Dizimizi oluşturduk.
        int [] sayi = {-895,-185,-650,-35,-280,-10,-3,0,2,280,5,6,572,1500,198,756,12};
        //Dizimizi küçükten büyüğe olacak şekilde sıraladık
        Arrays.sort(sayi);
        //Kullanıcıdan x bir sayı istedik
        int x;
        System.out.println("Bir sayı giriniz : ");
        Scanner girdi=new Scanner(System.in);
        x=girdi.nextInt();
        //küçükten büyüye sıralanan dizideki min ve max sayılarının indis numaralarını artık biliyoruz.
        int minSayi=sayi[0];
        int maxSayi=sayi[sayi.length-1];
        //forEach kullanarak diziyi içerisinde gezerken girilen veriyeye en uygun sayıyı buluyoruz.
        for (int i: sayi){
            if((i<x) && (i> minSayi)){
                minSayi=i;

            }
            if ((i>x) && (i<maxSayi)){
                maxSayi=i;
            }
        }
        //Sonuçları ekrana batırıyoruz.
        System.out.println("Girilen sayıya en yakın en küçük sayı "+ minSayi);
        System.out.println("Girilen sayıya en yakın en büyük sayı "+ maxSayi);

    }
}