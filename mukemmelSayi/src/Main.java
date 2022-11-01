public class Main {
    public static void main(String[] args) {

        int number=25;
        int tut=1;
        for (int i=2;i<=number/2;i++){
            if (number%i==0){
                tut+=i;
            }

        }
if (tut==number) System.out.println("mük");
else System.out.println("degil");
    }
}