
public class Main {
    public static void main(String[] args) {
        int [] sayi={1,2,3,4,5};
        double harmonikSeri=0;
        for (int i=0; i< sayi.length; i++){
            System.out.println(sayi[i]);
            harmonikSeri+=1.0/sayi[i];
        }
        System.out.println( sayi.length/harmonikSeri);
    }

}