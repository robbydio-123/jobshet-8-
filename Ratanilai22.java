import java.util.Scanner;

public class Ratanilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan Nilai N:");
        int N= sc.nextInt();
        int i= 1;
        int j= 1;
        float nilai =0, totalnilai =0, ratanilai=0;
        double nilaimhs;
        
            
            i=1;
            while (i<5){
                System.out.println("input nilai mahasiswa ke-" + i);

                totalnilai=0;
                for(j=1; j<=5;j++){
                    System.out.print("Nilai ke-" + j +" =" );
                    nilaimhs= sc.nextInt();
                    totalnilai+=nilaimhs;
                }
                ratanilai=totalnilai/5;
                System.out.println("nilai rata rata mahasiswa " + ratanilai);

                i++;
            }
        }
    }

