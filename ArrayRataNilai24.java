import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMhsLulus = 0, jumlahMhsTdkLulus = 0;
        double totalMhsLulus = 0,totalMhsTdkLulus = 0, rata2MhsLulus, rata2MhsTdkLulus;
        //modifikasi no1:
        // int jumlahMhsLulus = 0;
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for(int i = 0; i < nilaiMhs.length; i++){
            //modifikasi no1:
            // if (nilaiMhs[i] > 70) {
            //     jumlahMhsLulus += 1;
            // }
            if (nilaiMhs[i] > 70) {
                totalMhsLulus += nilaiMhs[i];
                jumlahMhsLulus++;
            }else{
                totalMhsTdkLulus += nilaiMhs[i];
                jumlahMhsTdkLulus++;
            }
        }
        rata2MhsLulus = totalMhsLulus / jumlahMhsLulus;
        rata2MhsTdkLulus = totalMhsTdkLulus / jumlahMhsTdkLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2MhsLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2MhsTdkLulus);
        //modifikasi no1:
        // System.out.println("Jumlah mahasiswa yang lulus (nilai lebih dari 70) = " + jumlahMhsLulus);
        sc.close();
    }
}
