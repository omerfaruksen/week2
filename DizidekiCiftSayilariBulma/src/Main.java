import java.util.Arrays;
public class Main {
    static  boolean isFind(int[] arr, int value){
        for (int i:arr){
            if (i==value && i%2==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //46 82 634 96 çift olmasına rağmen tekrarlamadım programın test amacından dolayı
    int[] sayi={1,12,12,12,3,4,4,4,15,46,82,21,26,26,26,61,6,34,36,36,35,81,41,96};
    int[] duplicate=new int [sayi.length];
    int startIndex=0;

    for (int i=0; i< sayi.length; i++){
        for (int j=0; j< sayi.length; j++){
            if (i!=j && sayi[i]==sayi[j]){
                if (!isFind(duplicate, sayi[i])){
                    duplicate[startIndex++]=sayi[i];
                }
                break;
            }
        }
    }
    //oluşturduğumuz çıktıda 0ların görünmesini istemedik.
    //çıktının bir dizi görünümünde olmasını istediğimden "[" ve "]" ekledim daha hoş duracağını düşündüm.

        System.out.print("[");
    for (int value: duplicate){
        if (value!=0){

            System.out.print(" "+value +" ");
        }

    }
        System.out.print("]");
    }
}