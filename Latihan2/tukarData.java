/*
 1. start
 2. int a, b
 3. input a
 4. input b
 5. int temp
 6. output (data sebelum ditukar)
 menukar kedua data
 7. temp = a
 8. a = b
 9. b = temp
 10. output (data setelah ditukar)
 11. end
 */

package LatihanDua;
import java.util.Scanner;

public class tukarData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MENUKAR 2 DATA");
        System.out.println("===============");
        System.out.print("Masukkan data A: ");
        int a = input.nextInt();
        System.out.print("Masukkan data B: ");
        int b = input.nextInt();
        int temp;
        System.out.println("Data sebelum ditukar: ");
        System.out.println("Data A: " + a);
        System.out.println("Data B: " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Data setelah ditukar: ");
        System.out.println("Data A: " + a);
        System.out.println("Data B: " + b);
        input.close();
    }
}
