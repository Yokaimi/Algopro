/*
 1. start
 2. int sks matematika = 2, sks algoritma = 3
 3. input nilai ujian matematika
 4. input nilai ujian algoritma
 5. mengalikan masing masing nilai matkul dengan sks
 6. menghitung total sks
 7. menghitung rata rata = (matematika + algoritma) / total sks
 8. output (rata rata)
 9. end
 */


package LatihanDua;
import java.util.Scanner;

public class sks {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        final int sksMatematika = 2;
        final int sksAlgoritma = 3;
        System.out.println("MENENTUKAN NILAI RATA RATA BERBOBOT DARI KEDUA MATKUL");
        System.out.print("Masukkan Nilai Matematika: ");
        double nilaiMatematika = data.nextInt();
        System.out.print("Masukkan Nilai Algoritma: ");
        double nilaiAlgoritma = data.nextInt();
        
        double totalNilaiMatematika = sksMatematika * nilaiMatematika;
        double totalNilaiAlgoritma = sksAlgoritma * nilaiAlgoritma;
        double totalSKS = sksMatematika + sksAlgoritma;
        double rataRata = (totalNilaiMatematika + totalNilaiAlgoritma) / totalSKS;
        System.out.println("Nilai Rata Rata: " + rataRata);
        data.close();
    }
}
