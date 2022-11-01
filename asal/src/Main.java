public class Main {
    public static void main(String[] args) {
        int number = 1;
        boolean tut = true;
if (number==1)
{
    System.out.println("sayi asal");
    return;
}
        if (number < 2) System.out.println("geçersiz sayi");
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) tut = false;
        }
        if (tut == false) System.out.println("sayi asal değil");
        else System.out.println("asal");
    }
}