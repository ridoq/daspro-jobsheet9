import java.util.Scanner;
public class TugasPertama24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, nilaiTertinggi = 0, nilaiTerendah = 100;
        System.out.print("Masukkan jumlah mahasiswa yang ingin diinput : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        double rata2;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        System.out.println("-".repeat(50));
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i]);
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Nilai Tertinggi mahasiswa adalah : " + nilaiTertinggi);
        System.out.println("Nilai Terendah mahasiswa adalah : " + nilaiTerendah);
        System.out.println("Rata-rata nilai mahasiswa adalah : " + rata2);
        sc.close();
    }
}
