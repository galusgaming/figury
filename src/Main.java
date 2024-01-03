import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i=1;
        while(i==1){
            Scanner scan = new Scanner(System.in);
            int wybor;
            System.out.println("jakie Figurę chcesz obliczyć?\n 1)Kwadrat\n 2)Prostokąt\n 3)Trójkąt\n 4)Wyjście");
            wybor = scan.nextInt();
            int bok1,bok2,wysokosc;
            switch(wybor){
                case 1:


                    System.out.println("Podaj bok");
                    bok1 = scan.nextInt();

                    System.out.println("Pole jest równe: " +Kwadrat.obliczKwadrat(bok1));
                    break;
                case 2:
                    System.out.println("Podaj bok");
                    bok1 = scan.nextInt();
                    System.out.println("podaj bok 2");
                    bok2 = scan.nextInt();
                    System.out.println("Pole jest równe: " +Prostokat.obliczProstokat(bok1,bok2));
                    break;
                case 3:
                    System.out.println("podaj bok");
                    bok1 = scan.nextInt();
                    System.out.println("podaj wysokość");
                    wysokosc = scan.nextInt();
                    System.out.println("Pole jest równe: " +Trojkat.obliczTrojkat(bok1,wysokosc));
                case 4:
                    i=0;
                    break;
            }
        }



    }
}