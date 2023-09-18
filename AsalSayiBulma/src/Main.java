import java.util.Scanner;

public class Main {
    //Recursive metotumuzu oluşturduk
    static void asal(int sayi){
        //Asal sayıyıbulma
        int sayac=0;
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Sayısı bir asal sayıdır.");
        }
        else {
            System.out.println(sayi + " Sayısı bir asal sayi degildir.");
        }

    }
    public static void main(String[] args) {
        int sayi;
        //Kullanıcıdan verileri alma
        Scanner info=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        sayi= info.nextInt();
        //Metot çağırma ve ekrana bastırma
        asal(sayi);

    }
}