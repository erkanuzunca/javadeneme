import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı " + mesaj.length());
        System.out.println("5.eleman " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('a'));*/
        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj.substring(0, 5));
        System.out.println(mesaj.substring(6, 10));
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        //küçültme
        System.out.println(mesaj.toLowerCase());
        //büyütme
        System.out.println(mesaj.toUpperCase());
        //boşluk silme
        System.out.println(mesaj.trim());
    }
}