import  java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, alinanSayi;
        Scanner info=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        n= info.nextInt();

        int[] list=new int[n];
        for (int i=0 ;i<n;i++){

            System.out.print( (i+1) +". Elemanı giriniz: : ");
            list[i]=info.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}