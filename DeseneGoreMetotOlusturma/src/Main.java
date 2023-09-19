import java.util.Scanner;
public class Main {

    static int rotate (int sayi ,int tempNumer){
    if (sayi>=0){
        System.out.print(sayi+" ");
        rotate (sayi-5,tempNumer);
    }
        System.out.print(sayi+" ");
    while (sayi>tempNumer){
        sayi+=5;
        System.out.print(sayi+" ");
    }
        return 1;
    }



    public static void main(String[] args) {
        int i;
        Scanner info=new Scanner(System.in);
        System.out.print("Desen Uzunluğunu Giriniz: ");
        i= info.nextInt();
        rotate(i,i);
    }
}