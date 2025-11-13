import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        //modifikasi no1
        int jumlahMhsLulus = 0;
        //
        double total = 0, rata2;
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for(int i = 0; i < nilaiMhs.length; i++){
            //modifikasi no1
            if (nilaiMhs[i] > 70) {
                jumlahMhsLulus += 1;
            }
            //
            total += nilaiMhs[i];
        }
        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        //modifikasi no1
        System.out.println("Jumlah mahasiswa yang lulus (nilai lebih dari 70) = " + jumlahMhsLulus);
        //
        sc.close();
    }
}
