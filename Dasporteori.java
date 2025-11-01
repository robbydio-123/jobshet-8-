public class Dasporteori {
    public static void main(String[] args) {
        
        char huruf = 'a'; // mulai dari a
        int jumlahBaris = 5; // jumlah baris
        int jumlahHuruf = 1; // jumlah huruf di baris pertama
        


        for (int i = 1; i <= jumlahBaris; i++) {
            for (int j = 1; j <= jumlahHuruf; j++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
            jumlahHuruf += 2; // bertambah 2 huruf tiap baris
        }
    }
}
