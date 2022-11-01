import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        String ortaMetin="İlginizi Çekebilir";
        String altMetin="Vade süresi";
        System.out.println(ortaMetin);
        int vade=12;
        double dolarDun=18.14;
        double dolarBugün= 18.10;
        boolean dolarDustuMu= false;
        String okYonu="";
        if (dolarBugün<dolarDun) {
            okYonu="down.svg";
            System.out.println(okYonu);
        }
        else {

            okYonu="up.svg";
            System.out.println(okYonu);
        }
    }
}