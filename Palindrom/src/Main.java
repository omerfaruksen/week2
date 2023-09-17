import java.util.Scanner;
public class Main {
    //Bir metot tanımladık
    static boolean isPalindrom(int number){
        //Değişkenleri tanımladık
        int temp=number, reverseNumber=0,lastNumber;
        //Döngümüzü kullandık
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        //Sonucu yazdırdık
        if (number==reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        //Kullanıcıdan aldığımız veriyi isPalindrom metotunu kullanarak test ettik ve ekrana bastırdık
        int number;
        Scanner info=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        number= info.nextInt();
        System.out.print(isPalindrom(number));
    }
}