import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Angkanya: ");
        int angka = sc.nextInt();

        for (int i = 0; i < 6; i++) {
            System.out.print(angka + " ");
        }
        System.out.println();

        System.out.println(angka + "         " + angka);

        for (int i = 0; i < 6; i++) {
            System.out.print(angka + " ");
        }
        System.out.println();

        System.out.println();

       
        for (int i = 0; i < 7; i++) {
            System.out.print(angka + " ");
        }
        System.out.println();

        
        for (int j = 0; j < 3; j++) {
            System.out.println(angka + "           " + angka);
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(angka + " ");
        }
        System.out.println();
    }
}
