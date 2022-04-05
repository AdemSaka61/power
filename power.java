import java.util.Scanner;

public class power {

    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {

            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true){
            System.out.print("Taban Değeri Giriniz :");
            int a = inp.nextInt();

            System.out.print("Üs Değerini Giriniz :");
            int b = inp.nextInt();

            System.out.println("Sonuç : " + pow(a,b));
        }

    }
}
