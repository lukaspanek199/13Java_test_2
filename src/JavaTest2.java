import java.util.Scanner;

public class JavaTest2 {
    public static void main(String[] args) {
        Banka bank = new Banka();
        Scanner sc = new Scanner(System.in);
        String vybranyuziatel;
        do {
            bank.vypisUzivatele(sc.nextLine());

        } while (true);
    }
}
