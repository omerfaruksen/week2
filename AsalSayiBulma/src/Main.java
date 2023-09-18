import java.util.Scanner;

public class Main {
    static void asal(int sayi){
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
        Scanner info=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        sayi= info.nextInt();
        asal(sayi);

    }
}