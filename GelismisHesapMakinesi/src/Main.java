import java.util.Scanner;
public class Main {
    static int sum(int a, int b){
        int result=a+b;
        System.out.println("Toplam : "+result);;
        return result;
    }
    static int minus(int a, int b){
        int result=a-b;
        System.out.println("Çıkarma : "+result);
        return result;
    }
    static int times(int a, int b){
        int result=a*b;
        System.out.println("Çarpma : " +result);
        return result;
    }
    static int divided(int a,int b){
        int result=a/b;
        System.out.println("Bölme : " +result);
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for (int i=1; i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a%b;
    }
    static void calculate(int a,int b){
        System.out.println("Çevresi : " +(2*(a+b)));
        System.out.println("Alanı : " +(a*b));
    }

    public static void main(String[] args) {
        Scanner info=new Scanner(System.in);
        int select;
        String menu= "1- Toplama İşlemi\n"
                +"2- Çıkarma İşlemi\n"
                +"3- Çarpma İşlemi\n"
                +"4- Bölme İşlemi\n"
                +"5- Üslü Sayı Hesaplama\n"
                +"6- Mod Alma\n"
                +"7- Dikdörtgen Alan ve Çevre Hesaplama\n"
                +"0- Çıkış";
        while (true){
            System.out.println(menu);
            System.out.println("Bir İşlem Seçiniz : ");
            select=info.nextInt();
            if (select==0 || select>7){
                break;
            }
            System.out.print("ilk Sayıyı Giriniz : ");
            int sayi1=info.nextInt();
            System.out.print("İkinci Sayiyi Giriniz : ");
            int sayi2=info.nextInt();

            switch (select){
                case 1:
                    sum(sayi1,sayi2);
                    break;
                case 2:
                    minus(sayi1,sayi2);
                    break;
                case 3:
                    times(sayi1,sayi2);
                    break;
                case 4:
                    if (divided(sayi1,sayi2)==0){
                        System.out.println("İkinci sayı 0'dan farklı olmalı!");
                    }else{
                        divided(sayi1,sayi2);
                    }
                    break;
                case 5:
                    System.out.println("Üs Hesabı : " +power(sayi1,sayi2));
                    break;
                case 6:
                    System.out.println("Mod Alma : " +mod(sayi1,sayi2));
                    break;
                case 7:
                    calculate(sayi1,sayi2);
                    break;
                default:





            }

        }

    }
}