import java.util.Scanner;
/** 1972037 Gabriel Octa M **/
public class Soal1_1972037_Gabriel_Octa_M {
    public static void main(String[] args) {
        int uang, deposito, totalsaldo;
        float bunga;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan uang yang hendak didepositokan: ");
        uang = scanner.nextInt();
        System.out.print("Masukkan lama deposito (tahun): ");
        deposito = scanner.nextInt();
        System.out.print("Masukkan bunga deposito: ");
        bunga = scanner.nextFloat();
        System.out.println("Jumlah uang: " + uang);
        int totaldep = (int) (uang * ((bunga * deposito) / 100));
        System.out.println("Bunga deposito: " + totaldep);
        totalsaldo = uang + totaldep;
        System.out.println("Saldo akhir: " + totalsaldo);
    }
}
