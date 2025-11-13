import java.util.Scanner;
public class TugasKedua24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalHarga = 0;
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlahPesanan = sc.nextInt();
        System.out.println("-".repeat(50));
        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[namaPesanan.length];
        sc.nextLine();
        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.print("Masukkan Pesanan ke-" + (i + 1) + " : ");
            namaPesanan[i] = sc.nextLine();
        }
        System.out.println("-".repeat(50));
        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.print("Masukkan harga " + namaPesanan[i] + " : ");
            hargaPesanan[i] = sc.nextInt();
            totalHarga += hargaPesanan[i];
        }
        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("List Pesanan : ");
        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.printf("%d. %-20s : Rp. %d\n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }
        System.out.println("-".repeat(50));
        System.out.printf("%-2s %-20s : Rp. %d", "", "Total Harga", (int) totalHarga);
        sc.close();
    }
}
