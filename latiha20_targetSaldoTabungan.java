
package pertemuan6;

import java.util.Scanner;

public class latiha20_targetSaldoTabungan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan saldo awal: Rp. ");
        double saldoAwal = input.nextDouble();
        System.out.print("Masukkan bunga per bulan (%): ");
        double bunga = input.nextDouble();
        System.out.print("Masukkan saldo target: Rp. ");
        double saldoTarget = input.nextDouble();

        int bulan = 0;
        while (saldoAwal < saldoTarget) {
            bulan++;
            saldoAwal += saldoAwal * (bunga / 100);
            System.out.printf("Saldo di bulan ke-%d: Rp. %.2f%n", bulan, saldoAwal);
        }

        System.out.println("Target tercapai dalam " + bulan + " bulan.");
    }

}
