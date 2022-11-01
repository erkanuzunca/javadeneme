public class Main {
    public static void main(String[] args) {
//220-284 pozitif tam bölenlerinin toplamları birbirilerine eşit
        //1 den başlayıp 220ye kadar toplamları 284
        //1 den başlayıp 284 e toplamları 220
        int say1 = 220;
        int say2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for (int i = 1; i < say1; i++) {
            if (say1 % i == 0) toplam1 += i;

        }
        for (int i = 1; i < say2; i++) {
            if (say2 % i == 0) toplam2 += i;

        }
        if (say1 == toplam2 && say2 == toplam1) {
            System.out.println("arkadaş");
        } else System.out.println("degil");
    }}