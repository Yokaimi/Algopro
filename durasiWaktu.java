/* 
1. start
2. double jamMulai, menitMulai, detikMulai
3. double jamAkhir, menitAkhir, detikAkhir
4. input jamMulai
5. input menitMulai
6. input detikMulai
7. input jamAkhir
8. input menitAkhir
9. input detikAkhir
10. double totalDetik
11. menghitung total detik
*/

package LatihanDua;
import java.util.Scanner;

public class durasiWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan waktu mulai ujian (HH:MM:SS): ");
        String waktuMulaiString = scanner.nextLine();
        String[] waktuMulaiArray = waktuMulaiString.split(":");
        int jamMulai = Integer.parseInt(waktuMulaiArray[0]);
        int menitMulai = Integer.parseInt(waktuMulaiArray[1]);
        int detikMulai = Integer.parseInt(waktuMulaiArray[2]);

        System.out.print("Masukkan waktu akhir ujian (HH:MM:SS): ");
        String waktuAkhirString = scanner.nextLine();
        String[] waktuAkhirArray = waktuAkhirString.split(":");
        int jamAkhir = Integer.parseInt(waktuAkhirArray[0]);
        int menitAkhir = Integer.parseInt(waktuAkhirArray[1]);
        int detikAkhir = Integer.parseInt(waktuAkhirArray[2]);

        int totalDetikMulai = jamMulai * 3600 + menitMulai * 60 + detikMulai;
        int totalDetikAkhir = jamAkhir * 3600 + menitAkhir * 60 + detikAkhir;

        int selisihDetik = totalDetikAkhir - totalDetikMulai;

        int jam = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println("Durasi ujian: " + jam + " jam, " + menit + " menit, " + detik + " detik");
        scanner.close();
    }
}
