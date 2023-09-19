import java.util.Scanner;
public class Main {

    static int rotate (int sayi ,int tempNumber){
        //Recursive metot kullandığımızdan dolayı metot kendini her tekrarladığında sayı değişkenimiz değişiyor.
        //Bu sebeple metot içerisinde tempNumber tanımlamak doğru olmayacağı için,
        //metot parametresi olarak tempNumber adında bir değişken daha tanımladık.
        //Bu sayede metot kendini her tekrarladığında sayı değişkeni yeni bir değer alırken,
        // tempNumber daima kullanıcıdan aldığımız veri olarak saklanacak.
        if (sayi>=0){
            System.out.print(sayi+" ");
            rotate (sayi-5,tempNumber); //program bu satıra geldiğinde otomatik olarak metodu baştan taramaya başlar.
        }
            System.out.print(sayi+" ");
        while (sayi>tempNumber){
            sayi+=5;
            System.out.print(sayi+" ");
        }
        return 1;
    }

    public static void main(String[] args) {
        //Değişken tanımlamalarını yaptık.
        int i;
        //kullanıcıdan verilerimizi aldık
        Scanner info=new Scanner(System.in);
        System.out.print("Desen Uzunluğunu Giriniz: ");
        i= info.nextInt();
        //İki adet parametre aldığımız için kullanıcıdan aldığımız veriyi i,i şeklinde rotate metoduna gönderdik.
        rotate(i,i);
    }
}