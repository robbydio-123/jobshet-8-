
import java.util.Scanner;

public class Triangle22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai N:");
        int N= sc.nextInt();
        int s=0;
        while(s < N) {
            int k = 0;
            while(k < s){
                System.out.print("*");
                k++;

            }
             System.out.println("*");
            s++;

        }
    }
    
}