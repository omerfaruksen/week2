import java.util.Scanner;

public class Main {
    //Metot oluşturduk
    static int exp(int a, int b){
        int result=1;
        for (int i=1; i<=b; i++){
            result*=a;
        }
        return result;
    }
    public static void main(String[] args) {
        //Değişkenleri tanımladık
        int a,b;
        //Kullanıcıdan verileri aldık
        Scanner info=new Scanner(System.in);
        System.out.print("Taban Sayısını giriniz : ");
        a=info.nextInt();
        System.out.print("Üs Sayısını Giriniz : ");
        b= info.nextInt();
        //exp metodunu çağırarak çıktıyı ekrana bastırdık
        System.out.println("Sonuç : " + exp(a,b));
    }
}