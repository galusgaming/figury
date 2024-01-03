import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int bok;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok");
        bok = scan.nextInt();

        System.out.println(Kwadrat.obliczKwadrat(bok));
        }
    }
}