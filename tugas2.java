import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPoltek, namaAtlet;
        String semuaData = "";
        int jumlahPoltek;
        int jumlahAtlet = 5;

        System.out.println("=== PENDAFTARAN ATLET CABOR 2024 ===");
        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        jumlahPoltek = sc.nextInt();
        sc.nextLine(); 

        
        for (int i = 1; i <= jumlahPoltek; i++) {
            System.out.println("\nPoliteknik ke-" + i);
            System.out.print("Nama Politeknik: ");
            namaPoltek = sc.nextLine();

            
            System.out.println("\nMasukkan nama 5 atlet untuk cabang Badminton:");
            for (int j = 1; j <= jumlahAtlet; j++) {
                System.out.print("  Atlet ke-" + j + ": ");
                namaAtlet = sc.nextLine();
                semuaData += namaPoltek + "\t" + namaAtlet + "\t(Badminton)\n";
            }

          
            System.out.println("\nMasukkan nama 5 atlet untuk cabang Tenis Meja:");
            for (int j = 1; j <= jumlahAtlet; j++) {
                System.out.print("  Atlet ke-" + j + ": ");
                namaAtlet = sc.nextLine();
                semuaData += namaPoltek + "\t" + namaAtlet + "\t(Tenis Meja)\n";
            }

            
            System.out.println("\nMasukkan nama 5 atlet untuk cabang Basket:");
            for (int j = 1; j <= jumlahAtlet; j++) {
                System.out.print("  Atlet ke-" + j + ": ");
                namaAtlet = sc.nextLine();
                semuaData += namaPoltek + "\t" + namaAtlet + "\t(Basket)\n";
            }

            
            System.out.println("\nMasukkan nama 5 atlet untuk cabang Bola Voli:");
            for (int j = 1; j <= jumlahAtlet; j++) {
                System.out.print("  Atlet ke-" + j + ": ");
                namaAtlet = sc.nextLine();
                semuaData += namaPoltek + "\t" + namaAtlet + "\t(Bola Voli)\n";
            }
        }

        
        System.out.println("\n===============================================================");
        System.out.println("                DAFTAR ATLET CABOR 2024");
        System.out.println("===============================================================");
        System.out.println("Politeknik\tNama Atlet\tCabang Olahraga");
        System.out.println("---------------------------------------------------------------");
        System.out.println(semuaData);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Jumlah Politeknik Terdaftar: " + jumlahPoltek);
        System.out.println("Setiap Politeknik mengirim 5 atlet per cabang olahraga.");
        System.out.println("===============================================================");
    }
}
